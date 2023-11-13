// working with fetch api

// 1 пример
// Задача: сделать get запрос на удаленный ресурс по url
// получить данные по сети
// использовать синтакси async/await и fetch
const requestButton = document.getElementById("request-button");

async function getApliacesData() {
  // Создаем переменную куда кладем наш url
  const apliancesURL = "https://gzavertyaev-dev.github.io/appliances.json";

  // Получаем обьект Response используя fetch- делая GET запрос
  // и await - для получения результата
  const response = await fetch(apliancesURL);
  console.log(response); // обьект Response
  console.log(response.ok); // true или false
  console.log(response.status); // 200,400,500 и т.д

  // OK или не ок - успешно завершен запрос или нет
  if (response.ok) {
    // Забираем результат выполнения response, т.е тело ответа(наш обьект)
    const result = await response.json();
    console.log(result);
    console.log(result.products);

    // Далле работаем с полученными данными как мы хотим
    const objWithIdSeven = result.products.find((el) => el.id === 7);
    console.log(objWithIdSeven);

    const div = document.createElement("div");
    div.textContent = objWithIdSeven.name;
    document.body.append(div);
  } else {
    // ловим ошибку
    console.log("Some Erorr");
  }

  // Альтернатива - через try...catch - однако catch не ловит все ошибки
  // в случае с fetch - поэтому нужно все равно явно проверять  if (response.ok) {} else{}

  //   try {
  //     const result = await response.json();
  //     console.log(result);

  //     if (response.ok) {
  //       // делаем операции с успешным выполнением
  //     } else {
  //       // вызываем ошибку
  //       throw new Error("error");
  //     }
  //   } catch (error) {
  //     console.log(error);
  //   }
}

requestButton.addEventListener("click", getApliacesData);
