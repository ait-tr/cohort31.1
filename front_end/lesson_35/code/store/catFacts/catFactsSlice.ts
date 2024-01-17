import { PayloadAction, createAsyncThunk, createSlice } from "@reduxjs/toolkit"
import { v4 } from "uuid"

import { CatFact, CatFactsResponseData, CatFactsState } from "./types"

const catFactsInitialState: CatFactsState = {
  data: [],
  error: null,
  isLoading: false,
}

export const getCatFacts = createAsyncThunk(
  "CATFACTS/getCatFacts",
  async () => {
    const response = await fetch("https://catfact.ninja/fact")

    const result = await response.json()

    return result
  },
)

const catFactsSlice = createSlice({
  initialState: catFactsInitialState,
  name: "CATFACTS",
  reducers: {
    deleteFact: (state: CatFactsState, { payload }: PayloadAction<string>) => {
      state.data = [...state.data].filter(
        (catFact: CatFact) => catFact.id !== payload,
      )
    },
    resetCatFactsState: () => catFactsInitialState,
  },
  extraReducers: (builder) => {
    builder
      .addCase(getCatFacts.pending, (state: CatFactsState) => {
        // Очищаем ошибку state.error = null, на случай, если запрос не первый, и у нас уже была ошибка
        state.error = null
        state.isLoading = true
      })
      .addCase(
        getCatFacts.fulfilled,
        (
          state: CatFactsState,
          { payload }: PayloadAction<CatFactsResponseData>,
        ) => {
          state.isLoading = false
          state.data = [...state.data, { fact: payload.fact, id: v4() }]
        },
      )
      .addCase(
        getCatFacts.rejected,
        (state: CatFactsState, { payload }: PayloadAction<any>) => {
          state.isLoading = false
          state.error = payload
        },
      )
  },
})

export const catFactsActions = catFactsSlice.actions

export const catFactsReducers = catFactsSlice.reducer
