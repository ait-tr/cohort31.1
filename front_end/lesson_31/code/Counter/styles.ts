import styled from "styled-components"

import { colors } from "styles/colors"

export const CounterWrapper = styled.div`
  display: flex;
  align-items: center;
  gap: 15px;
  min-width: 300px;
  height: fit-content;
  padding: 40px;
  background-color: ${colors.primary};
`

export const Count = styled.p`
  font-size: 20px;
  font-weight: bold;
  color: ${colors.white};
`
