import { useDispatch, useSelector } from "react-redux"
// import { ChangeEvent, useState } from "react"
import { useFormik } from "formik"

import { todoListSelector } from "store/redux/todoList/selectors"
import { todoListActions } from "store/redux/todoList/todoListSlice"
import Input from "components/Input"
import { Task } from "store/redux/todoList/types"
import Button from "components/Button"

import {
  TodoListContainer,
  TodoListForm,
  TodoListParagraph,
  TodoListWrapper,
} from "./styles"

function TodoList() {
  const dispatch = useDispatch()
  const todoList = useSelector(todoListSelector)
  // Стейт написал для примера, чтобы мы вспомнили как хранить значения из инпута через useState()
  // const [todoValue, setTodoValue] = useState<string>("")

  const formik = useFormik({
    initialValues: {
      taskName: "",
    },
    onSubmit: (values) => {
      if (!formik.values.taskName) {
        alert("Пожалуйста, введите данные")
        return
      }

      dispatch(todoListActions.addTask(values.taskName))
    },
  })

  return (
    <TodoListWrapper>
      <TodoListForm onSubmit={formik.handleSubmit}>
        {/* контроль через formik */}
        <Input
          labelName="TODO"
          placeholder="Введите занятие"
          name="taskName"
          value={formik.values.taskName}
          onChange={formik.handleChange}
        />
        {/* контроль через useState */}
        {/* <Input
          labelName="TODO"
          placeholder="Введите занятие"
          name="taskName"
          value={todoValue}
          onChange={(event: ChangeEvent<HTMLInputElement>) => {
            setTodoValue(event.target.value)
          }}
        /> */}
        <Button type="submit" name="Запланировать событие" />
      </TodoListForm>
      {todoList.length > 0 && (
        <TodoListContainer>
          {todoList.map((task: Task, index: number) => (
            <TodoListParagraph
              key={task.id}
              onClick={() => {
                dispatch(todoListActions.deleteTask(task.id))
              }}
            >
              {/* {`${index + 1}. ${task.taskName}`} */}
              {task.taskName}
            </TodoListParagraph>
          ))}
          <Button
            name="Очистить список"
            onClick={() => {
              dispatch(todoListActions.resetTodoListState())
            }}
          />
        </TodoListContainer>
      )}
    </TodoListWrapper>
  )
}

export default TodoList
