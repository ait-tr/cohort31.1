import { ChangeEvent, useState } from "react"
import { useDispatch, useSelector } from "react-redux"

import {
  getWeatherInfo,
  weatherActions,
} from "store/redux/weather/weatherSlice"
import { AppDispatch } from "store/store"
import { weatherSelector } from "store/redux/weather/selectors"
import WeatherInfo from "pages/Weather/components/WeatherInfo"
import WeatherButton from "pages/Weather/components/WeatherButton"
import WeatherInput from "pages/Weather/components/WeatherInput"
import WeatherError from "pages/Weather/components/WeatherError"

import { InputButtonWrapper, WeatherHomeWrapper, Loading, WeatherButtonWrapper } from "./styles"

function WeatherHome() {
  const [city, setCity] = useState<string>("")

  const dispatch: AppDispatch = useDispatch()
  const { weatherData, isLoading, error } = useSelector(weatherSelector)

  return (
    <WeatherHomeWrapper>
      <InputButtonWrapper>
        <WeatherInput
          placeholder="Enter city name"
          onChange={(event: ChangeEvent<HTMLInputElement>) => {
            setCity(event.target.value)
          }}
        />
        <WeatherButtonWrapper>
        <WeatherButton
          name="Search"
          onClick={() => {
            if (city.trim().length > 0) {
              dispatch(getWeatherInfo(city))
              return
            }

            alert("Enter city, please")
          }}
        />
        </WeatherButtonWrapper>
      </InputButtonWrapper>
      {isLoading && <Loading>Loading...</Loading>}
      {weatherData && (
        <WeatherInfo
          temp={weatherData.temp}
          icon={weatherData.icon}
          cityName={weatherData.cityName}
          onDelete={() => {
            dispatch(weatherActions.deleteWeatherData())
          }}
          onSave={() => {
            dispatch(weatherActions.saveWeatherDataToList(weatherData))
          }}
        />
      )}
      {error && <WeatherError />}
    </WeatherHomeWrapper>
  )
}

export default WeatherHome
