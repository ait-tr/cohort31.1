/* Задание 1
По аналогии с тем как мы работали с обьектом appliances, который я разместил на github pages.
Создайте новый репозиторий на гитхаб, разместите в нем файл ИМЯ_ФАЙЛА.json на ваш выбор (например, 
можно про страну или автомобиль и т.д.). Опубликуйте на git pages. Получите ссылку, куда кидать fetch.
После этого создайте страницу с подключенным js файлом. Получите информацию из вашего json при помощи fetch 
и async/await, отразите ее на странице, отобразить желательно красиво - задание творческое
*/
async function readJsonFile() {
  const link = "https://egorknestyapin.github.io/appliances.json";
  console.log("Включить индикатор загрузки");

  const response = await fetch(link);

  if (response.ok) {
    console.log("Выключить спиннер");
    const result = await response.json();
    const ol = document.createElement("ol");
    document.body.append(ol);

    // result.products.forEach((element) => {
    //   const li = document.createElement("li");
    //   ol.append(li);
    //   const id = document.createElement("div");
    //   id.textContent = "Id продукта: " + element.id;
    //   li.append(id);
    //   const name = document.createElement("div");
    //   name.textContent = "Наименование: " + element.name;
    //   li.append(name);
    //   const brand = document.createElement("div");
    //   brand.textContent = "Бренд: " + element.brand;
    //   li.append(brand);
    //   const type = document.createElement("div");
    //   type.textContent = "Тип: " + element.type;
    //   li.append(type);
    //   if (element.capacity_kg) {
    //     const capacityKg = document.createElement("div");
    //     capacityKg.textContent = "Вместимость(кг): " + element.capacity_kg;
    //     li.append(capacityKg);
    //   }
    //   if (element.capacity_liters) {
    //     const capacityLiters = document.createElement("div");
    //     capacityLiters.textContent =
    //       "Вместимость(литр): " + element.capacity_liters;
    //     li.append(capacityLiters);
    //   }
    //   if (element.number_of_burners) {
    //     const numberOfBurners = document.createElement("div");
    //     numberOfBurners.textContent =
    //       "Количество горелок: " + element.number_of_burners;
    //     li.append(numberOfBurners);
    //   }
    //   if (element.power_watts) {
    //     const powerWatts = document.createElement("div");
    //     powerWatts.textContent = "Мощность(ватт): " + element.power_watts;
    //     li.append(powerWatts);
    //   }
    //   if (element.coffee_types) {
    //     const coffeeTypes = document.createElement("div");
    //     coffeeTypes.textContent = "Виды кофе:";
    //     const ul = document.createElement("ul");
    //     element.coffee_types.forEach((element) => {
    //       const li = document.createElement("li");
    //       li.append(element);
    //       ul.append(li);
    //     });
    //     coffeeTypes.append(ul);
    //     li.append(coffeeTypes);
    //   }
    //   if (element.features) {
    //     const features = document.createElement("div");
    //     features.textContent = "Доп. особенности:";
    //     const ul = document.createElement("ul");
    //     element.features.forEach((element) => {
    //       const li = document.createElement("li");
    //       li.append(element);
    //       ul.append(li);
    //     });
    //     features.append(ul);
    //     li.append(features);
    //   }
    //   const price = document.createElement("div");
    //   price.textContent = "Цена: " + element.price;
    //   li.append(price);
    //   const availability = document.createElement("div");
    //   availability.textContent =
    //     "Доступность: " +
    //     (element.availability ? "есть в наличии" : "нет в наличии");
    //   li.append(availability);
    // });

    // result.products.forEach((product) => {
    //   const card = document.createElement("div");
    //   card.classList.add("card");
    //   card.innerHTML = `
    //     <h3>${product.name}</h3>
    //     <p>Бренд: ${product.brand}</p>
    //     <p>Тип: ${product.type}</p>
    //     <p>${product.features.join(", ")}</p>
    //     <p>Цена: ${product.price} руб.</p>
    //     <p class="${product.availability ? "availability" : "unavailability"}">${
    //     product.availability ? "В наличии" : "Нет в наличии"
    //   }</p>
    //   `;
    //   ol.appendChild(card);
    // });

    result.products.forEach((element) => {
      const li = document.createElement("li");
      ol.append(li);

      li.innerHTML = `
      <div>Id продукта: ${element.id}</div>
      <div>Наименование: ${element.name}</div>
      <div>Бренд: ${element.brand}</div>
      <div>Тип: ${element.type}</div>
      ${
        element.capacity_kg
          ? `<div>Вместимость(кг): ${element.capacity_kg}</div>`
          : ""
      }
      ${
        element.capacity_liters
          ? `<div>Вместимость(литр): ${element.capacity_liters}</div>`
          : ""
      }
      ${
        element.number_of_burners
          ? `<div>Количество горелок: ${element.number_of_burners}</div>`
          : ""
      }
      ${
        element.power_watts
          ? `<div>Мощность(ватт): ${element.power_watts}</div>`
          : ""
      }
      ${
        element.coffee_types
          ? `
        <div>Виды кофе:</div>
        <ul>${element.coffee_types
          .map((type) => `<li>${type}</li>`)
          .join("")}</ul>
      `
          : ""
      }
      ${
        element.features
          ? `
        <div>Доп. особенности:</div>
        <ul>${element.features
          .map((feature) => `<li>${feature}</li>`)
          .join("")}</ul>
      `
          : ""
      }
      <div>Цена: ${element.price}</div>
      <div>Доступность: ${
        element.availability ? "есть в наличии" : "нет в наличии"
      }</div>
    `;
    });
  } else {
    console.log("Some error");
  }
}
readJsonFile();
