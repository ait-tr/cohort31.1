// Promise.all()

// // Пример с успешным выполнением Promise.all()
// // 1 - создадим массив промисов
// const promises = [
//   new Promise((resolve) => {
//     setTimeout(() => resolve(1), 1000);
//   }),
//   new Promise((resolve) => {
//     setTimeout(() => resolve(2), 2000);
//   }),
//   new Promise((resolve) => {
//     setTimeout(() => resolve(3), 1500);
//   }),
// ];

// // 2 - запускаем все промисы через Promise.all

// Promise.all(promises)
//   .then((result) => {
//     console.log("Все промисы завершились успешно", result);
//   })
//   .catch((error) => {
//     console.log("Один из промисов завершился с ошибкой", error);
//   });

// // Пример с ошибкой в Promise.all()

// // 1 - создадим массив промисов
// const promisesWithError = [
//   new Promise((resolve) => {
//     setTimeout(() => resolve(1), 1000);
//   }),
//   new Promise((_, reject) => {
//     setTimeout(() => reject("Some error"), 1500);
//   }),
//   new Promise((resolve) => {
//     setTimeout(() => resolve(3), 2000);
//   }),
// ];

// // 2 - запускаем все промисы через Promise.all
// Promise.all(promisesWithError)
//   .then((result) => {
//     console.log("Все промисы завершились успешно", result);
//   })
//   .catch((error) => {
//     console.log("Один из промисов завершился с ошибкой", error);
//   });

// Promise.race()

// 1 - создадим массив промисов
const promises = [
  new Promise((resolve) => {
    setTimeout(() => resolve(1), 2000);
  }),
  new Promise((_, reject) => {
    setTimeout(() => reject("Some error"), 1000);
  }),
  new Promise((resolve) => {
    setTimeout(() => resolve(3), 1500);
  }),
];

// 2 - запускаем все промисы через Promise.race

Promise.race(promises)
  .then((result) => {
    console.log("Первый успешный промис", result);
  })
  .catch((error) => {
    console.log("Первый промис с ошибкой", error);
  });
