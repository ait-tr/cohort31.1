import { PayloadAction, createSlice } from "@reduxjs/toolkit"
import { TodoListState } from "./types"
import { v4 } from "uuid"

const todoListInitialState: TodoListState = {
  list: [],
}

const todoListSlice = createSlice({
  initialState: todoListInitialState,
  name: "TODOLIST",
  reducers: {
    addTask: (state: TodoListState, { payload }: PayloadAction<string>) => {
      const newTaskObj = { taskName: payload, id: v4() }
      state.list = [...state.list, newTaskObj]
    },
    deleteTask: (state: TodoListState, action: PayloadAction<string>) => {
      console.log(action)
      state.list = [...state.list].filter((task) => task.id !== action.payload)
    },
    resetTodoListState: () => todoListInitialState,
  },
})

export const todoListActions = todoListSlice.actions

export const todoListReducers = todoListSlice.reducer
