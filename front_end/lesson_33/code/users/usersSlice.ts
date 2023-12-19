import { createSlice, PayloadAction } from "@reduxjs/toolkit"
import { v4 } from "uuid"

import { UsersState, AddUserPayload } from "./types"

const usersInitialState: UsersState = {
  users: [],
}

const usersSlice = createSlice({
  name: "USERS",
  initialState: usersInitialState,
  reducers: {
    // 2 аргумент у любого reducer - это обьект action
    // что такое обьект action?
    // action = {
    //  payload: {} //это данные которые мы передаем из компонента при диспатче экшена в круглых скобках
    // type: "USER/addUser" // это автоматичекси сгенерированный тип, мы можем увидить его в redux Devtools
    // }
    addUser: (
      state: UsersState,
      { payload }: PayloadAction<AddUserPayload>,
    ) => {
      //  каждому новому добавленному обьекту мы добавляем id и генерируем ее через v4() из библиотеки uuid:
      // Например если payload = { firstlastName: "John", age: "23", jobTitle: "QA"}
      // { ...payload, id: v4() } === { firstlastName: "John", age: "23", jobTitle: "QA", id: v4()}
      // console.log([state.users]) // массив обьектов пытаемся положить в новосохзданный пустой массив []
      // console.log([...state.users]) // через spread оператор в новосозданный пустой массив положить все данные вутри state.users

      state.users = [...state.users, { ...payload, id: v4() }]
    },
    deleteUser: (state: UsersState, { payload }: PayloadAction<string>) => {
      state.users = [...state.users].filter(
        (userObject) => userObject.id !== payload,
      )
    },
    deleteAllUsers: () => usersInitialState
  },
})

export const usersActions = usersSlice.actions

export const usersReducers = usersSlice.reducer
