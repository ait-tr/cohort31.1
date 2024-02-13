import { createSlice } from "@reduxjs/toolkit"

// Это наше дефолтовое состояние при инициализации приложения
const counterInitialState = {
  count: 0,
}

// Создаем slice - это функция, которая передает данные в глобальный стор,
// создает reducers и actions
const counterSlice = createSlice({
  // Имя по которому мы следим за состоянием в сторе
  name: "COUNTER",
  // создаем стейт для стора, передав ему initalValue
  initialState: counterInitialState,
  reducers: {
    add: (state) => {
      state.count += 1
    },
  },
})


export const actions = counterSlice.actions;

export const counterReducer = counterSlice.reducer;