import { configureStore, ThunkAction, Action } from "@reduxjs/toolkit"

import { counterReducer } from "./redux/counter/counterSlice"

export const store = configureStore({
  reducer: {
    counter: counterReducer,
  },
})

export type AppDispatch = typeof store.dispatch
export type RootState = ReturnType<typeof store.getState>
export type AppThunk<ReturnType = void> = ThunkAction<
  ReturnType,
  RootState,
  unknown,
  Action<string>
>

// Дааные в Redux store лежат примерно таким образом

// const globalStore = {
//  counter: {
//    count:0
//   },
//   auth: {
//     token: "ASDAFASDASD123124124124ADCADF",
//     privateRules: false,
//   },
//   weather: {
//     city: "Berlin",
//     temp: "1423142",
//     feelsLikeTemp: "123",
//   },
// }
