// import { useState } from "react"
import { useDispatch, useSelector } from "react-redux"

import { actions } from "store/redux/counter/counterSlice"
import { counterState } from "store/redux/counter/selectors"
import Button from "components/Button"

import { CounterWrapper, Count } from "./styles"

function Counter() {
  // ЭТО СПОСОБ РАБОТЫ COUNTER ЧЕРЕЗ  useState(), Т.Е ЧЕРЕЗ ЛОКАЛЬНОЕ ХРАНИЛИЩЕ
  // // count - это само значение
  // // setCount - то,что это значение меняет и при вызове происходит updating компонента(компонент перерендеривается)
  // const [count, setCount] = useState<number>(0)

  // const onPlus = () => {
  //   setCount((prevValue: number) => prevValue + 1)
  // }

  // const onMinus = () => {
  //   setCount((prevValue: number) => prevValue - 1)
  // }

  // const onDivide = () => {
  //   setCount((prevValue: number) => prevValue / 2)
  // }

  // const onMultiply = () => {
  //   setCount((prevValue: number) => prevValue * 2)
  // }

  // Создаем функцию dispatch - эта функция вызывает action, который скажет store
  // какой именно reducer нужно вызвать
  const dispatch = useDispatch()
  const counter = useSelector(counterState)
  console.log(counter)

  const onPlus = () => {
    // Мы "диспатчим" action под именем add - имя совпадает с именем функции редьюсера
    dispatch(actions.add())
  }

  const onMinus = () => {
    dispatch(actions.minus())
  }

  const onMultiply = () => {
    dispatch(actions.multiply(3))
  }

  const onDivision = () => {
    dispatch(actions.division(4))
  }

  return (
    <CounterWrapper>
      {/* ЭТО СПОСОБ РАБОТЫ COUNTER ЧЕРЕЗ  useState(), Т.Е ЧЕРЕЗ ЛОКАЛЬНОЕ ХРАНИЛИЩЕ
      <Button name="Divide"  onClick={onDivide}/>
      <Button name="Minus" onClick={onMinus} />
      <Count>{Number(count.toFixed(2))}</Count>
      <Button name="Plus" onClick={onPlus} />
      <Button name="Multiply" onClick={onMultiply} /> */}
      <Button name="Divide" onClick={onDivision} />
      <Button name="Minus" onClick={onMinus} />
      <Count>{Number(counter.count.toFixed(2))}</Count>
      <Button name="Plus" onClick={onPlus} />
      <Button name="Multiply" onClick={onMultiply} />
    </CounterWrapper>
  )
}

export default Counter
