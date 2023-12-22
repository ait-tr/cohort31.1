import { PayloadAction, createAsyncThunk, createSlice } from "@reduxjs/toolkit"
import { WeatherState, WeatherInfoData } from "./types"
import { v4 } from "uuid"

const weatherInitialState: WeatherState = {
  weatherData: undefined,
  weatherDataList: [],
  isLoading: false,
  error: null,
}

export const getWeatherInfo = createAsyncThunk(
  "WEATHER/getWeatherInfo",
  async (city: string, { rejectWithValue }) => {
    const APP_ID: string = "339eefdb8be5d321edc00550315211c1"

    const response = await fetch(
      `https://api.openweathermap.org/data/2.5/weather?q=${city}&appid=${APP_ID}`
    )

    const result = await response.json()

    if (!response.ok) {
      return rejectWithValue(result)
    }

    return result
  },
)

const weatherSlice = createSlice({
  initialState: weatherInitialState,
  name: "WEATHER",
  reducers: {
    saveWeatherDataToList: (
      state: WeatherState,
      action: PayloadAction<WeatherInfoData>,
    ) => {
      state.weatherDataList = [...state.weatherDataList, action.payload]
      state.weatherData = undefined
    },
    deleteWeatherData: (state: WeatherState) => {
      state.weatherData = undefined
    },
    deleteWeatherDataFromiIst: (
      state: WeatherState,
      { payload }: PayloadAction<string>,
    ) => {
      state.weatherDataList = [...state.weatherDataList].filter(
        (weatherItem: WeatherInfoData) => weatherItem.id !== payload,
      )
    },
    resetWeatherDataList: (state: WeatherState) => {
      state.weatherDataList = []
    },
    restWeatherError: (state: WeatherState) => {
      state.error = null
    },
  },
  extraReducers: (builder) => {
    builder
      .addCase(getWeatherInfo.pending, (state: WeatherState) => {
        state.error = null
        state.weatherData = undefined
        state.isLoading = true
      })
      .addCase(
        getWeatherInfo.fulfilled,
        (state: WeatherState, { payload }: PayloadAction<any>) => {
          state.isLoading = false
          state.weatherData = {
            id: v4(),
            cityName: payload.name,
            icon: `https://openweathermap.org/img/w/${payload.weather[0].icon}.png`,
            temp: `${Math.round(payload.main.temp - 273.15)}°`,
          }
        },
      )
      .addCase(
        getWeatherInfo.rejected,
        (state: WeatherState, { payload }: PayloadAction<any>) => {
          console.log(payload)
          state.isLoading = false
          state.error = {
            cod: payload.cod,
            message: payload.message,
          }
        },
      )
  },
})

export const weatherActions = weatherSlice.actions

export const weatherReducers = weatherSlice.reducer
