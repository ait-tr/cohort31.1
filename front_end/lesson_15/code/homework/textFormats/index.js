// XML и JSON - текстовые форматы передачи данных
// XML - синтаксис похож на HTML
// JSON - синтаксих похож на JavaScript

// Как выглядит XML?
{
  /* <note>
  <to>Tove</to>
  <from>Jani</from>
  <heading>Reminder</heading>
  <body>Don't forget me this weekend!</body>
</note> */
}

// JSON
// 1 - ключ оборачивается в строку - в двойные кавычки
// 2 - значения оборачиваются в троку по правилу типизации(если у нас тип данных стринг, то в двойные кавычки, если остальное то нет)
// 3- в остальном выглядит и соблюдает правила написания обычного обьекта в JS
// Как выглядит?
// {
//   "persons": [
//     {
//       "id": 1,
//       "name": "Alex",
//       "age": 28,
//       "isWorking": true
//     },
//     {
//       "id": 2,
//       "name": "Misha",
//       "age": 30,
//       "isWorking": true
//     },
//     {
//       "id": 3,
//       "name": "Kate",
//       "age": 45,
//       "isWorking": true
//     },
//     {
//       "id": 4,
//       "name": "Oleh",
//       "age": 50,
//       "isWorking": true
//     },
//     {
//       "id": 5,
//       "name": "Lena",
//       "age": 35,
//       "isWorking": false
//     }
//   ]
// }
