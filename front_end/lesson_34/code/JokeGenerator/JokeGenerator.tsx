import { useDispatch, useSelector } from "react-redux"

import { jokeGeneratorSeletor } from "store/redux/jokeGenerator/selectors"
import { getJoke } from "store/redux/jokeGenerator/jokeGeneratorSlice"
import Button from "components/Button"
import {AppDispatch } from 'store/store'

import { JokeGeneratorWrapper, JokeContainer, Paragraph } from "./styles"

function JokeGenerator() {
  const dispatch: AppDispatch = useDispatch()
  const { data, error, isLoading } = useSelector(jokeGeneratorSeletor)

  console.log(data)
  console.log(error)
  console.log(isLoading)

  return (
    <JokeGeneratorWrapper>
      <JokeContainer>
        <Button
          name="Get Joke"
          onClick={() => {
            // тут будем диспатчить экшн
            dispatch(getJoke())
          }}
        />
        {isLoading && <Paragraph>LOADING...</Paragraph>}
        {data && (
          <>
            <Paragraph>{data.setup}</Paragraph>
            <Paragraph>{data.punchline}</Paragraph>
          </>
        )}
        {error && <Paragraph>Error response</Paragraph>}
      </JokeContainer>
    </JokeGeneratorWrapper>
  )
}

export default JokeGenerator
