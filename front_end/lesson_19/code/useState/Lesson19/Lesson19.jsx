import { useState } from "react";
import Button from "../../components/Button";
import Counter from "../../components/Counter";

import "./styles.css";

function Lesson19() {
  // Пример стейта с массивом данных
  const [item, setItems] = useState(["apple"]);
  // Пример стейта с обьектами
  const [preson, setPerson] = useState({ name: "Kate", age: 28 });
  // Пример стейта без initialValue, т.е initialValue изначально = undefined
  const [name, setName] = useState();
  console.log(name);

  // Пример стейта с img
  const [img, setImg] = useState();

  const [count, setCount] = useState(0);

  const onPlus = () => {
    // prevValue, позволяет нам получить то значение в стейте, которое ожидается
    setCount((prevValue) => prevValue + 1);
    setCount((prevValue) => prevValue + 1);
    // без prevValue, мы рискуем получить не тот результат который ожидается
    // т.к setState асинхронный
    // setCount(count + 1);
    // setCount(count + 1);
  };

  const onMinus = () => {
    setCount((prevValue) => prevValue - 1);
    setCount((prevValue) => prevValue - 1);
    // setCount(count - 1);
    // setCount(count - 1);
  };

  // Добавляем новый данные в стейт с item
  const addFruites = (newFruitesArray) => {
    setItems((prevValue) => [...prevValue, ...newFruitesArray]);
  };

  // Добавляем св-во цвет волос в стейт person
  const addPesonHairColor = (colorHair) => {
    setPerson((prevValue) => ({ ...prevValue, colorHair }));
  };

  // Создаем функцию которая принимает как аргумент url картинки и кладет ее в стейт
  const addImg = (imgURL) => {
    setImg(imgURL);
  };

  // Методом map создаем массив их JSX элементов и выводим их на экран
  const newItems = item.map((el) => {
    return <div key={`fruits-items-${Math.random()}`}>{el}</div>;
  });

  // Методом Object.keys(preson) мы превращаем обьект preson в массив ключей
  // и с помощью map создаем массив из JSX элементов и выводим их на экран
  const newPersons = Object.keys(preson).map((personKeys) => {
    return (
      <li key={`person-props-${Math.random()}`}>
        {personKeys}: {preson[personKeys]}
      </li>
    );
  });

  return (
    <div className="lesson19-wrapper">
      <div className="itemsControl">{newItems}</div>
      <div className="buttonControl">
        <Button
          name="Add fruites"
          onClick={() => addFruites(["cherry", "orange"])}
        />
      </div>
      <div className="itemsControl">
        Person properies:
        <ul>{newPersons}</ul>
      </div>
      <div className="buttonControl">
        <Button
          name="Add Hair Color"
          onClick={() => addPesonHairColor("Black")}
        />
      </div>
      <div>Counter</div>
      <Counter count={count} onPlus={onPlus} onMinus={onMinus} />
      <div>Пример с пустым стейтом</div>
      <div className="buttonControl">
        <Button name="Add name" onClick={() => setName("Alex")} />
      </div>
      {name}
      <div>Пример с картинкой</div>
      {img && <img src={img} />}
      <div className="buttonControl">
        <Button
          name="Add image"
          onClick={() =>
            addImg(
              "https://www.azcentral.com/gcdn/-mm-/fd5c5b5393c72a785789f0cd5bd20acedd2d2804/c=0-350-2659-1850/local/-/media/Phoenix/BillGoodykoontz/2014/04/24//1398388295000-Homer-Simpson.jpg?width=2659&height=1500&fit=crop&format=pjpg&auto=webp"
            )
          }
        />
      </div>
    </div>
  );
}

export default Lesson19;
