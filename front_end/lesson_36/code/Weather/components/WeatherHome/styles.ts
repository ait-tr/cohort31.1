import styled from "styled-components"
import { colors } from "styles/colors"

export const WeatherHomeWrapper = styled.div`
  display: flex;
  flex-direction: column;
  align-items: center;
  max-width: 709px;
  height: 100%;
  gap: 120px;
`

export const Loading = styled.p`
  font-size: 30px;
  font-weight: 700;
  color: ${colors.white};
`

export const InputButtonWrapper = styled.div`
  display: flex;
  justify-content: center;
  width: 100%;
  margin-top: 30px;
  gap: 12px;
`

export const WeatherButtonWrapper= styled.div`
  width: 146px;
`
