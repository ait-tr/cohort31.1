// Находит div по имени класса box через getElementsByClassName
const box = document.getElementsByClassName("box")[0];
// const box = document.querySelector(".box"); // альтернатива ищем через querySelector
const button = document.getElementById("changeColorBtn");

button.addEventListener("click", () => {
  setTimeout(() => {
    box.style.backgroundColor = "green";
  }, 2000);
});
