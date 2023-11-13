// Async/await

// Создание таймера

// function delay(ms) {
//   // вернет нам промис через ms
//   return new Promise((resolve, reject) => {
//     if (ms > 5000) {
//       setTimeout(() => reject(new Error("Some Error")), ms);
//     } else {
//       setTimeout(() => resolve({ name: "some name", age: 28 }), ms);
//     }
//   });
// }
// // создаем асинхронную функцию delayedLog
// async function delayedLog() {
//   console.log("Начало выполнения");
//   // забираем результат выполнения промиса
//   // delay(2000).then() - аналог

//   try {
//     let response = await delay(6000);
//     console.log(response);
//   } catch (error) {
//     console.log(error);
//   }
// }

// // Вызов delayedLog()
// delayedLog();

// 2 пример с Promise.all()

// function delay(ms) {
//   // вернет нам промис через ms
//   return new Promise((resolve, reject) => {
//     setTimeout(() => resolve({ timer: ms }), ms);
//   });
// }

// async function combineSyncResults() {
//   const result = await Promise.all([delay(1000), delay(2000)]);
//   console.log(result);
// }

// combineSyncResults();
