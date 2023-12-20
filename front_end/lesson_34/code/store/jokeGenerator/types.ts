export interface JokeGeneratorState {
  data: null | JokeData
  error: any
  isLoading: boolean
}

export interface JokeData {
  setup: string
  punchline: string
}

export interface JokeDataPayload {
  type: string
  setup: string
  punchline: string
  id: number
}
