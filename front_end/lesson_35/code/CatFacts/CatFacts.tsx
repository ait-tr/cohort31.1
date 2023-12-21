import { useEffect } from "react"
import { useDispatch, useSelector } from "react-redux"

import {AppDispatch} from 'store/store'
import { catFactsState } from "store/redux/catFacts/selectors"
import Button from "components/Button"
import {
  catFactsActions,
  getCatFacts,
} from "store/redux/catFacts/catFactsSlice"
import { CatFact } from "store/redux/catFacts/types"

import {
  ButtonWrapper,
  CatFactButtonContrainer,
  CatFactsContainer,
  CatFactsElement,
  CatFactsWrapper,
  Paragraph,
} from "./styles"

function CatFacts() {
  const dispatch: AppDispatch = useDispatch()
  const { data, isLoading, error } = useSelector(catFactsState)

  useEffect(() => {
    if (!!error) {
      alert("Ошибка сети")
    }
  }, [error])

  return (
    <CatFactsWrapper>
      <CatFactsContainer>
        <Button
          name="Get Cat Fact"
          onClick={() => {
            dispatch(getCatFacts())
          }}
          disabled={isLoading}
        />
        {isLoading && <Paragraph>Loading...</Paragraph>}
        {data.length > 0 && (
          <>
            {data.map((catFact: CatFact) => (
              <CatFactButtonContrainer key={catFact.id}>
                <CatFactsElement>{catFact.fact}</CatFactsElement>
                <ButtonWrapper>
                  <Button
                    name="Delete fact"
                    type="button"
                    onClick={() => {
                      dispatch(catFactsActions.deleteFact(catFact.id))
                    }}
                  />
                </ButtonWrapper>
              </CatFactButtonContrainer>
            ))}
            <Button
              name="Delete all facts"
              type="button"
              onClick={() => {
                dispatch(catFactsActions.resetCatFactsState())
              }}
            />
          </>
        )}
      </CatFactsContainer>
    </CatFactsWrapper>
  )
}

export default CatFacts
