import WeatherOutlinedButton from "pages/Weather/components/WeatherOutlinesButton"

import {
  CityName,
  IconWrapper,
  TempWrapper,
  WeatherInfoContainer,
  WeatherInfoWrapper,
  ButtonsContainer,
} from "./styles"
import { WeatherInfoProps } from "./types"

function WeatherInfo({
  temp,
  icon,
  cityName,
  isOnlyDeleteButton,
  onSave,
  onDelete,
}: WeatherInfoProps) {
  return (
    <WeatherInfoWrapper>
      <WeatherInfoContainer>
        <TempWrapper>
          {temp}
          <CityName>{cityName}</CityName>
        </TempWrapper>
        <IconWrapper>
          <img src={icon} alt="weatherIcon" />
        </IconWrapper>
      </WeatherInfoContainer>
      {!isOnlyDeleteButton ? (
        <ButtonsContainer>
          <WeatherOutlinedButton
            onClick={onSave}
            name="Save"
          />
          <WeatherOutlinedButton
            onClick={onDelete}
            name="Delete"
          />
        </ButtonsContainer>
      ) : (
        <WeatherOutlinedButton
          onClick={onDelete}
          name="Delete"
        />
      )}
    </WeatherInfoWrapper>
  )
}

export default WeatherInfo
