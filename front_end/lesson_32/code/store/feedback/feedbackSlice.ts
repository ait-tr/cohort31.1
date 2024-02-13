import { createSlice } from "@reduxjs/toolkit"

import { FeedbackState } from "./types"

const feedbackInitialState: FeedbackState = {
  countLike: 0,
  countDisLike: 0,
}

const feedbackSlice = createSlice({
  name: "FEEDBACK",
  initialState: feedbackInitialState,
  reducers: {
    addLike: (state: FeedbackState) => {state.countLike += 1},
    addDisLike: (state: FeedbackState) => {state.countDisLike += 1 },
    resetResults: () => feedbackInitialState
  },
})

export const actions = feedbackSlice.actions;

export const feedbackReducer = feedbackSlice.reducer;

