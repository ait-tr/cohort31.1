// метод getElementById()
const newParagraph = document.getElementById("hello-world");
console.log(newParagraph);

// метод поиска по тэгам getElementsByTagName
const div = document.getElementsByTagName("div");
console.log(div);

// метод посика по классам
const boxClassesElements = document.getElementsByClassName("box");
console.log(boxClassesElements);

// метод поиска по css селекторам

// мы тут используем querySelector() и он выводит нам первый элемент который найдет
const selector = document.querySelector("div");
console.log(selector);

// мы тут используем querySelectorAll() и он выводит нам все элементы, которые найдет
const selectors = document.querySelectorAll("div");
console.log(selectors);

// Добавление новых элементов

// пример 1
const ul = document.getElementById("personal-list");

ul.textContent = "Тут будет список";

let li1 = (document.createElement("li").textContent = "QA");
let li2 = (document.createElement("li").textContent = "Frontend");
let pBefore = (document.createElement("p").textContent = "Добален до списка");
let pAfter = (document.createElement("p").textContent = "Добален после списка");

ul.append(li1);
ul.prepend(li2);
ul.before(pBefore);
ul.after(pAfter);

// использование innerHTML

const form = document.getElementById("formId");
console.log(form);
console.log(form.innerHTML);

const successDiv = `<div id="success">Вы успешно зарегистрировались</div>`;

form.innerHTML = `${successDiv}`;

console.log(form.innerHTML);

// находим div по ID
const successDivByID = document.getElementById("success");

successDivByID.style.color = "green";

const link = document.getElementById("dev-link");

link.addEventListener("click", (event) => {
  // Предотвращает стандартное поведение браузера
  event.preventDefault();
  // проверяем предотвращено ли стандартное поведение браузера
  console.log(event.defaultPrevented);
  // если у вас элемент будет input то в value будет зраниться значение которое вы ввели с клавиатуры
  console.log(event.target.value);
  // Удаляем div элемент
  successDivByID.remove();
});

// пример с инпут

const input = document.getElementById("name");

input.addEventListener("change", (event) => {
  console.log(event.target.value);
});
