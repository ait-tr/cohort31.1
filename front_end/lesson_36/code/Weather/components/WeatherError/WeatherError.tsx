import { useSelector, useDispatch } from "react-redux";

import {
  weatherActions,
} from "store/redux/weather/weatherSlice"
import { AppDispatch } from "store/store"

import WeatherOutlinedButton from "pages/Weather/components/WeatherOutlinesButton"

import {weatherSelector } from "store/redux/weather/selectors";

import { ApiError, DeleteButtonWrapper, ErrorMessage, WeatherErrorWrapper } from "./styles";

function WeatherError() {
  const dispatch: AppDispatch = useDispatch()
  const { error } = useSelector(weatherSelector);

  const onDeleteErorr=() => {
    dispatch(weatherActions.restWeatherError())
  }

  return (
    <WeatherErrorWrapper>
      <ApiError>{`API Error ${error?.cod}`}</ApiError>
      <ErrorMessage>{error?.message}</ErrorMessage>
      <DeleteButtonWrapper>
        <WeatherOutlinedButton
              onClick={onDeleteErorr}
              name="Delete"
            />
      </DeleteButtonWrapper>
    </WeatherErrorWrapper>
  );
}

export default WeatherError;
