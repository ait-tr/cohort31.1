import { useSelector, useDispatch } from "react-redux"
import { v4 } from "uuid"

import { usersState } from "store/redux/users/selectors"
import { User } from "store/redux/users/types"
import Button from "components/Button"

import { UsersPageWrapper, UserCard, Paragraph } from "./styles"
import { usersActions } from "store/redux/users/usersSlice"

function Users() {
  const usersSt = useSelector(usersState)
  const dispatch = useDispatch()

  return (
    <UsersPageWrapper>
      {usersSt.map((user: User) => {
        return (
          <UserCard key={v4()}>
            <Paragraph>{`First/Last name: ${user.firstlastName}`}</Paragraph>
            <Paragraph>{`Age: ${user.age}`}</Paragraph>
            <Paragraph>{`Job: ${user.jobTitle}`}</Paragraph>
            <Button
              name="Delete User"
              type="button"
              onClick={() => {
                dispatch(usersActions.deleteUser(user.id))
              }}
            />
          </UserCard>
        )
      })}
      { usersSt.length > 0 && <Button name="Delete all users" onClick={() => {
        dispatch(usersActions.deleteAllUsers())
      }}/>}
    </UsersPageWrapper>
  )
}

export default Users
