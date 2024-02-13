import styled from "styled-components"
import { colors } from "styles/colors"

export const WeatherInfoWrapper = styled.div`
  display: flex;
  flex-direction: column;
  align-items: center;
  gap: 19px;
  width: 100%;
  height: 220px;
  padding: 28px 36px;
  background: linear-gradient(
    134deg,
    rgba(47, 72, 111, 0.62) 5.78%,
    rgba(11, 27, 52, 0.62) 96.58%
  );
  backdrop-filter: blur(4px);
  border-radius: 20px;
`

export const WeatherInfoContainer = styled.div`
  display: flex;
  width: 100%;
`

export const TempWrapper = styled.div`
  display: flex;
  flex-direction: column;
  justify-content: center;
  align-items: center;
  width: fit-content;
  font-size: 57px;
  color: ${colors.white};
  gap: 6px;
`

export const CityName = styled.p`
  font-size: 18px;
`

export const IconWrapper = styled.div`
  display: flex;
  justify-content: center;
  flex: 1;
`

export const ButtonsContainer = styled.div`
  display: flex;
  gap: 95px;
`
