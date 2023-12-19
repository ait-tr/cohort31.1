export interface User {
  id: string
  firstlastName: string
  age: string
  jobTitle: string
}

export interface AddUserPayload {
  firstlastName: string
  age: string
  jobTitle: string
}

export interface UsersState {
  users: User[]
}
