// Мы должны получить доступ ко всем необходимым элементам

const plusButtonElement = document.getElementById("plus"); // доступ к кнопке +
const minusButtonElement = document.getElementById("minus"); // доступ к кнопке -
const counterElement = document.getElementById("counterId"); // доступ к counter элементу

// Проверяем доступ ко всем элементам
console.log(plusButtonElement);
console.log(minusButtonElement);
console.log(counterElement);

// Создаем переменную counter, котрая будет зранить актуальное значение счетчика
let counter = 0;

const plusHandler = () => {
  // увеличиваем counter на 1
  counter++;
  // Вернули counter  в counterElement
  counterElement.textContent = counter;
};

const minusHandler = () => {
  //уменьшаем цифру на 1
  counter--;
  // вернуть counter в counterElement
  //innerText
  counterElement.innerText = counter;
};

// прослушка событий plusHandler и minusHandler
plusButtonElement.addEventListener("click", plusHandler);
minusButtonElement.addEventListener("click", minusHandler);
