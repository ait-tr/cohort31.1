import { createSlice, PayloadAction } from "@reduxjs/toolkit"

import { CounterInitialState } from "./types"

// counterInitialState - это дефолтовое состояние для counter state
const counterInitialState: CounterInitialState = {
  count: 0,
}

// Создаем slice - это функция, которая передает данные в глобальный стор,
// создает reducers и actions
const counterSlice = createSlice({
  // Имя по которому мы следим за состоянием в сторе
  // когда будет вызыватся reducer, мы будем по этому имени следить
  // за изменением в стейте в Redux Devtools
  name: "COUNTER",
  // создаем стейт для стора, передав ему initalValue
  initialState: counterInitialState,
  reducers: {
    // функция reducer - ф-я которая меняет стейт и принимает в себя 2 аргумента:
    // 1 аргумент - это текщее состояние в стейте
    // 2 аргумент - это action
    // action - это обьект, состощий из 2 ключей. 1 - это type - тип вызываемого экшена. 2 -это payload - то что мы передем из компонента в качестве аргумента
    // {
    // type: "COUNTER/add",
    // payload: то что мы передаем - передать можно все что угодно
    // }
    add: (state: CounterInitialState) => {
      state.count = state.count + 1 // в стейте сейчас напрмиер count ===10 , соответственно в результат е этого выражениея будет 10, 11, 12 и т.д
    },
    minus: (state: CounterInitialState) => {
      state.count = state.count - 1
    },
    multiply: (
      state: CounterInitialState,
      { payload = 2 }: PayloadAction<number | undefined>,
    ) => {
      console.log(payload)

      state.count = state.count * payload
    },
    division: (
      state: CounterInitialState,
      { payload = 2 }: PayloadAction<number | undefined>,
    ) => {
      state.count = state.count / payload
    },
  },
})

// action - это наши наши "экшены", которые мы будем "диспатчить", т.е говорить store
// какой reducer вызвать. мы должны передавать actions в компонент, в котьром мы планируем "диспатчить экшн"
export const actions = counterSlice.actions

// counterReducer - передаем в store, чтобы положить state в наш стор
export const counterReducer = counterSlice.reducer
