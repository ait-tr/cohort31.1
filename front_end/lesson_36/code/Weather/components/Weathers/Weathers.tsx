import { useDispatch, useSelector } from "react-redux"

import { weatherSelector } from "store/redux/weather/selectors"
import { WeatherInfoData } from "store/redux/weather/types"
import WeatherInfo from "../WeatherInfo"
import WeatherButon from "../WeatherButton"
import { weatherActions } from "store/redux/weather/weatherSlice"

import { WeathersWrapper, WeathersCardsContainer } from "./styles"

function Weathers() {
  const dispatch = useDispatch()
  const { weatherDataList } = useSelector(weatherSelector)

  return (
    <WeathersWrapper>
      <WeathersCardsContainer>
        {weatherDataList.map((weatherInfo: WeatherInfoData) => (
          <WeatherInfo
            key={weatherInfo.id}
            temp={weatherInfo.temp}
            cityName={weatherInfo.cityName}
            icon={weatherInfo.icon}
            isOnlyDeleteButton
            onDelete={() => {
              dispatch(weatherActions.deleteWeatherDataFromiIst(weatherInfo.id))
            }}
          />
        ))}
      </WeathersCardsContainer>
      {weatherDataList.length > 0 && (
        <WeatherButon
          name="Delete all cards"
          onClick={() => {
            dispatch(weatherActions.resetWeatherDataList())
          }}
        />
      )}
    </WeathersWrapper>
  )
}

export default Weathers
