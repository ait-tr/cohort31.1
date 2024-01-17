// Homework taks3

function decode(code){
    switch (code) {
      case "SQ":
        return "шквал";
      case "PO":
        return "пыльный вихрь";
      case "FC":
        return "торнадо";
      case "BR":
        return "дымка (видимость от 1 до 9 км)";
      case "HZ":
        return "мгла (видимость менее 10 км)";
      case "FU":
        return "дым (видимость менее 10 км)";
      case "DS":
        return "пыльная буря (видимость менее 10 км)";
      case "SS":
        return "песчаная буря (видимость менее 10 км)";
      default:
        return "нет такого когда";
    }
  }

  function weatherCode(weather_code, decode){
    return decode(weather_code);
  }

  const result = weatherCode("PO", decode);
  console.log(result);
  console.log(weatherCode("SS", decode));
  console.log(weatherCode("AA", decode));

// создать функцию, кот принимает массив и выводит колличество элементов в нем!!!

const animals = ["Кошка", "Собака", "Олень", "Хомяк"];

const arraySum = (array) => array.length;

console.log(arraySum(animals));

// Создать и передать коллбэк функцию c аргументами a,b, callback в ф-ию summer,
// которая будет возвращать сумму 2 чисел 

const first = 5;
const second = 20;

const summer = (a, b, callback) => {
 console.log(callback(a, b));
};

const sum = (a, b) => {
  return a + b;
};

summer(first, second, sum);
