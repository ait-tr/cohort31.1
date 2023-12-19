import { useFormik } from "formik"
import { useDispatch } from "react-redux"

import Input from "components/Input"
import Button from "components/Button"
import { usersActions } from "store/redux/users/usersSlice"

import { HomePageWrapper, UserForm, UserFormName } from "./styles"

function Home() {
  const dispatch = useDispatch()

  const formik = useFormik({
    initialValues: {
      firstlastName: "",
      age: "",
      jobTitle: "",
    },
    onSubmit: (values) => {
      dispatch(usersActions.addUser(values))
      console.log(values)
    },
  })

  console.log(formik)

  return (
    <HomePageWrapper>
      <UserForm onSubmit={formik.handleSubmit}>
        <UserFormName>Create User</UserFormName>
        <Input
          name="firstlastName"
          value={formik.values.firstlastName}
          labelName="First/Last name"
          onChange={formik.handleChange}
        />
        <Input
          name="age"
          value={formik.values.age}
          labelName="Age"
          onChange={formik.handleChange}
        />
        <Input
          name="jobTitle"
          value={formik.values.jobTitle}
          labelName="Job title"
          onChange={formik.handleChange}
        />
        <Button name="Create" type="submit" />
      </UserForm>
    </HomePageWrapper>
  )
}

export default Home
