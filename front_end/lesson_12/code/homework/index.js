// // Задача 1

const cars = [
  { brand: "BMW", price: 20000, isDiesel: true },
  { brand: "Mercedes", price: 22000, isDiesel: false },
  { brand: "Audi", price: 30000, isDiesel: false },
  { brand: "Porshe", price: 50000, isDiesel: true },
  { brand: "Nissan", price: 25000, isDiesel: false },
];

// 1 способ решения через rest оператор

const newArrayCase1 = cars.map((value) => {
  const { price, ...rest } = value;

  return rest;
});

console.log(newArrayCase1);

// 2 способ c методом forEach(), и rest оператором

const newArrayCase2 = [];

cars.forEach((value) => {
  const { price, ...rest } = value;

  newArrayCase2.push(rest);
});

console.log(cars);
console.log(newArrayCase2);

// Как работает rest и spread

const newArrayWithRest = cars.map((value) => {
  // Порядок деструктуризации не важен, первым может быть и brand
  //   const { price, isDiesel, brand } = value;
  const { price, ...rest } = value;

  console.log(price);
  console.log(rest);

  // const newPrice = value.price;
  // const isDiesel = value.isDiesel;

  return rest;
});

console.log(newArrayWithRest);

// 3 вариант решения задачи - с использованием метода delete и map()

const newArrayCase3 = cars.map((values) => {
  // клонируем обьект
  const { ...rest } = values;
  // удаляем св-во price из нового обьекта
  delete rest.price;

  // возвращаем новые обьекты
  return { ...rest };
});

console.log(newArrayCase3);

// Задача 4

const newArrayWithReduce = cars
  // отфильтровали массив cars c машинами у которых isDiesel === false
  .filter((values) => !values.isDiesel)
  // сумма всех price
  .reduce((accumulator, currentValue) => {
    // неправильный вариант решения , т.к мы пытаемся вызвать price так 22000.price
    // console.log(accumulator.price);
    // console.log(currentValue.price); // 22000.price
    // return accumulator.price + currentValue.price;
    console.log("acc =", accumulator);
    console.log("currentValue =", currentValue.price);
    return accumulator + currentValue.price;
  }, 0);

console.log(newArrayWithReduce);
