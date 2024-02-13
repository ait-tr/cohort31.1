import { useState } from "react";

import Button from "../../components/Button";
import "./styles.css";

function Lesson18() {
  // useState() explanation
  // Первая переменная которую возвращает хук useState - это значение( в нашем примере это name),
  // вторая переменная - это функция которая это значение меняет на новое(в нашем примере - это setName)
  const [name, setName] = useState("Igor");
  const [isShowMessage, setIsShowMessage] = useState(false);
  const [count, setCount] = useState(0);
  console.log(name);
  // Создаем функцию changeName, которая будет вызывать метод setName
  const changeName = () => {
    // setName меняет значение в useState
    setName("Ekaterina");
  };

  const counterHendler = () => {
    // 1 вариант: использовать синтаксис передавая в state новое значение
    // setCount(count + 1);

    // 2 вариант: передаем туда функию
    setCount((prevValue) => prevValue + 1);
  };
  // Не нужно теперь писать такой длинный синтаксис чтобы сделать
  // какое-то событие
  // const button = document.getElementById("someid");
  // button.addEventListener("click", () => {
  //   console.log("Button works on click");
  // });
  const showSum = (a, b) => console.log(a + b);

  return (
    <div>
      <div className="buttonContol">
        <Button onClick={() => showSum(2, 3)} name="Показать сообщение 1" />
      </div>
      <div className="buttonContol">
        <Button
          onClick={() => console.log("Hello world 2")}
          name="Показать сообщение 2"
        />
      </div>
      <div className="buttonContol">
        <Button
          onClick={() => console.log("Hello world 3")}
          name="Показать сообщение 3"
        />
      </div>
      <p>{name}</p>
      <div className="buttonContol">
        <Button onClick={changeName} name="Изменить имя" />
      </div>
      {isShowMessage && <div>State is true now</div>}
      <div className="buttonContol">
        <Button
          onClick={() => setIsShowMessage(!isShowMessage)}
          name="Показать сообщение"
        />
      </div>
      <div>Count: {count}</div>
      <div className="buttonContol">
        <Button onClick={counterHendler} name="Увеличить на 1" />
      </div>
    </div>
  );
}

export default Lesson18;
