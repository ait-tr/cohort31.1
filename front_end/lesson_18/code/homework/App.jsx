import "./App.css";
import Button from "./components/Button/Button";
import ProfileCard from "./components/ProfileCard";

function App() {
  const profileInfo1 = {
    avatar:
      "https://super-avatara.ru/images/trueimg/pictures/69/08010C5B042B-69.gif",
    firstName: "John",
    lastName: "Smith",
    occupation: "React-developer",
    hairColor: "Blue",
    height: "160 sm",
    hobby: "Computer games",
    homePets: {
      dog: "Spyke",
      cat: "cat1",
    },
  };

  const profileInfo2 = {
    avatar:
      "https://super-avatara.ru/images/trueimg/pictures/69/62164C9D620F-69.gif",
    firstName: "Иван",
    lastName: "Иванов",
    occupation: "Фронтендер",
    hairColor: "Серый",
    height: "175 см",
    hobby: "Рыбалка",
  };

  const profileInfo3 = {
    avatar:
      "https://super-avatara.ru/images/trueimg/pictures/69/94B37D6DE14F-69.gif",
    firstName: "Tina",
    lastName: "Turner",
    occupation: "Singer",
    hairColor: "Gold",
    height: "170 sm",
    hobby: "Music",
  };

  return (
    <div className="App">
      <div className="card-container">
        <ProfileCard profileInfo={profileInfo1} />
        <ProfileCard profileInfo={profileInfo2} />
        <ProfileCard profileInfo={profileInfo3} />
      </div>

      <div className="button-container">
        <Button name="Отправить" type="submit" />
      </div>
      <div className="button-container">
        <Button name="Получить" />
      </div>
      <div className="button-container">
        <Button />
      </div>
      <div className="button-container">
        <Button />
      </div>
    </div>
  );
}

export default App;
