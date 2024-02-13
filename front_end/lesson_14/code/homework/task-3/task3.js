// Создаем функцию showNumbers, которая возращает нам промис и в качестве аргумента принимает кол-во сек
function showNumbers(seconds) {
  return new Promise((resolve, reject) => {
    setTimeout(() => resolve(`Прошло ${seconds} секунд(ы)`), seconds * 1000);
    setTimeout(() => reject("Error"), 5000);
  });
}

// Создаем массив секунд
const timers = [3, 2, 4, 1, 2, 6];

// перебираем timers через forEach()
timers.forEach((second) => {
  showNumbers(second) // вызываем showNumbers() для каждого элемента массива
    .then((result) => console.log(result)) // вызываем then для успешного выполнения
    .catch((error) => console.log(error)); // на catch ловим ошибку
});

// function wait(time) {
//   showNumbers(time)
//     .then((result) => console.log(result)) // вызываем then для успешного выполнения
//     .catch((error) => console.log(error)); // на catch ловим ошибку
// }

// showNumbers(3).then((result) => console.log(result));
// showNumbers(2).then((result) => console.log(result));
// showNumbers(4).then((result) => console.log(result));
// showNumbers(1).then((result) => console.log(result));
// showNumbers(2).then((result) => console.log(result));
// showNumbers(3).then((result) => console.log(result));
