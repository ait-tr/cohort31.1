import { createSelector } from "@reduxjs/toolkit";
import { RootState } from "store/store";

const globalState = (state: RootState) => state;

export const todoListSelector = createSelector(
  globalState,
  (state: RootState) => state.todolist.list
);
