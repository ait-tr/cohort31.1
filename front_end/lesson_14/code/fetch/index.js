// working with fetch api

// 1 пример
// Задача: сделать get запрос на удаленный ресурс по url
// получить данные по сети
// использовать синтакси async/await и fetch
const requestButton = document.getElementById("request-button");

async function getApliacesData() {
  const apliancesURL = "https://gzavertyaev-dev.github.io/appliances.json";

  // Получаем обьект Response
  const response = await fetch(apliancesURL);
  console.log(response);
  console.log(response.ok);
  console.log(response.status);

  // OK или не ок - успешно завершен запрос или нет
  if (response.ok) {
    // Забираем результат выполнения response, т.е тело ответа(наш обьект)
    const result = await response.json();
    console.log(result);
    console.log(result.products);

    const objWithIdSeven = result.products.find((el) => el.id === 7);
    console.log(objWithIdSeven);

    const div = document.createElement("div");
    div.textContent = objWithIdSeven.name;
    document.body.append(div);
  } else {
    console.log("Some Erorr");
  }

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
