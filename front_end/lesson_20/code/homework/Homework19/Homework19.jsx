import { useState } from "react";

import Button from "../../components/Button";

import "./styles.css";

function Homework19() {
  const [car, setCar] = useState({});
  console.log(car);

  const porscheCar = {
    brand: "Porsche",
    model: "911",
    year: 2023,
    color: "Silver",
    price: 120000,
    isAvailable: false,
  };

  // Создаем функцию, которая будет сохранять обьект porscheCar в наш state
  const savePorsheCar = (car) => {
    setCar(car);
  };

  // Создаем маасив JSX элементов(<li></li>) динамически с использованием Object.keys и метода map()
  // Если мы хотим показать данные из обьекта на странице динамически:
  // 1. Получаем массив ключей используя метод Object.keys(car)// ["brand", "model","year", "color", "price", "isAvailable"]
  // 2. Далее мы делаем map() нашего созданного массива
  // 3. carKey - это каждый из ключей в массиве, по кторому мы с помощью map() проходите по циклу
  // 4. С помощью синтаксиса JSX мы это отображаем {carKey}: {`${car[carKey]}`}
  const cars = Object.keys(car).map((carKey) => {
    // Функция carContent() решает какой контент нам показывать в li
    const carContent = () => {
      // Когда map доходит до ключа isAvailable, проверяем это и смотрим
      // isAvailable === true или же isAvailable === false
      if (carKey === "isAvailable") {
        // Тут return сработает если isAvailable === true
        if (car[carKey]) {
          return "Available";
        }
        // Тут return сработает если isAvailable === false
        return "Unavailable";
      }

      return `${carKey}: ${car[carKey]}`;
    };

    return <li key={`porshe-car-${Math.random()}`}>{carContent()}</li>;
  });

  return (
    <div className="homework19-wrapper">
      <div className="button-control">
        <Button
          name="Save Porshe car"
          onClick={() => savePorsheCar(porscheCar)}
        />
      </div>
      <ul className="car-item-container">{cars}</ul>
    </div>
  );
}

export default Homework19;
