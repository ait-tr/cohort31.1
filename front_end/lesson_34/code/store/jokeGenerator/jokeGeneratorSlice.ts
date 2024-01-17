import { createSlice, createAsyncThunk, PayloadAction } from "@reduxjs/toolkit"

import { JokeData, JokeGeneratorState, JokeDataPayload } from "./types"

const jokeGeneratorInitialState: JokeGeneratorState = {
  data: null, // В data мы будем хранить успешно пришедшие данные с ответа на звпрос
  error: null, // В error мы будем хранить данные об ошибке с ответа на звпрос
  isLoading: false, // Это индикатор загрузки данных по сети
}

// Создаем асинхронный middleware функцию Thunk через createAsyncThunk
export const getJoke = createAsyncThunk("JOKE_GENERATOR/getJoke", async () => {
  // Делаем get запрос на сервер
  const response = await fetch(
    "https://official-joke-api.appspot.com/random_joke",
  )
  // В result у нас будет лежать либо успешно пришедшие данные, либо ошибка
  const result = await response.json()

  return result
})

const jokeGeneratorSlice = createSlice({
  name: "JOKE_GENERATOR",
  initialState: jokeGeneratorInitialState,
  reducers: {},
  extraReducers: (builder) => {
    builder
      // Первым запускается pending
      .addCase(getJoke.pending, (state: JokeGeneratorState) => {
        state.data = null
        state.error = null
        state.isLoading = true
      })
      // Когда данные приходят у нас вызвается либо fulfilled, либо rejected case
      .addCase(
        getJoke.fulfilled,
        (
          state: JokeGeneratorState,
          { payload }: PayloadAction<JokeDataPayload>,
        ) => {
          state.isLoading = false
          state.data = { setup: payload.setup, punchline: payload.punchline }
        },
      )
      .addCase(
        getJoke.rejected,
        (state: JokeGeneratorState, { payload }: PayloadAction<any>) => {
          state.isLoading = false
          state.error = payload
        },
      )
  },
})

export const jokeGeneratorActions = jokeGeneratorSlice.actions

export const jokeGeneratorReducers = jokeGeneratorSlice.reducer
