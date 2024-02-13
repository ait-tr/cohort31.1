import styled from "styled-components";
import { colors } from "styles/colors";

export const WeatherErrorWrapper = styled.div`
  display: flex;
  flex-direction: column;
  align-items: center;
  width: 100%;
  height: 220px;
  padding: 16px 0 28px;
  background: linear-gradient(
    134deg,
    rgba(47, 72, 111, 0.62) 5.78%,
    rgba(11, 27, 52, 0.62) 96.58%
  );
  backdrop-filter: blur(4px);
  border-radius: 20px;
`;

export const ApiError = styled.p`
  margin-bottom: 6px;
  color: #f35e5e;
  font-size: 57px;
  line-height: 69px;
`;

export const ErrorMessage = styled.p`
  font-size: 18px;
  line-height: 22px;
  color: ${colors.white};
`;

export const DeleteButtonWrapper = styled.p`
  width: 155px;
  margin-top: 30px;
`;
