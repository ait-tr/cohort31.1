//
/*
Задание 3
На базе приложение "Counter", сделанного на занятии,(используйте код, который я писал), написать дополнительные условия для работы счётчика:

Минимальное значение, которое может принимать счётчик - 0

Максимальное значение - 10

По умолчанию значение счётчика - 0

При минмальном значении:

фон кнопки "-" на счётчике окрашивается в красный цвет
тип курсора мыши при наведении на кнопку - not-allowed
При максимальном значении:

фон кнопки "+" на счётчике окрашивается в красный цвет
курсор мыши при наведении на кнопку - not-allowed
При всех остальных значениях:

кнопки "-" и "+" имеют одинаковый цвет - azure
тип курсора мыши при наведении на кнопку - pointer
!!!Код для задания 3 вы можете найти в LMS во вкладке "Code" в файлах: "./code/counter/index.html", "./code/counter/index.js", "./code/counter/styles.css"
*/

const plusButton = document.getElementById("plus");
const minusButton = document.getElementById("minus");
const counterElement = document.getElementById("counterId");

console.log(plusButton);
console.log(minusButton);
console.log(counterElement);

let counter = 0;

// функция которая срабатывает сразу
const initializeApp = () => {
  if (counter === 0) {
    minusButton.style.background = "red";
    minusButton.style.cursor = "not-allowed";
    // например показать строку прветствия
  }
};

// функция которая делает нашу кнопку нормальной по стилям
const minusNormalButton = () => {
  minusButton.style.background = "azure";
  minusButton.style.cursor = "pointer";
};

// функция которая делает нашу кнопку красной по стилям
const minusRedButton = () => {
  minusButton.style.background = "red";
  minusButton.style.cursor = "not-allowed";
};

const plusRedButon = () => {
  plusButton.style.background = "red";
  plusButton.style.cursor = "not-allowed";
};

const plusNormalButon = () => {
  plusButton.style.background = "azure";
  plusButton.style.cursor = "pointer";
};

initializeApp();

const plusHandler = () => {
  if (counter < 10) {
    counter++;
    counterElement.textContent = counter;

    minusNormalButton();
  }
  if (counter >= 10) {
    plusRedButon();
  }
};

const minusHandler = () => {
  if (counter > 0) {
    counter--;
    counterElement.innerText = counter;

    plusNormalButon();
  }

  if (counter <= 0) {
    minusRedButton();
  }
};

plusButton.addEventListener("click", plusHandler);
minusButton.addEventListener("click", minusHandler);
