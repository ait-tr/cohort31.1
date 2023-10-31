const divFigureElement = document.getElementById("figure");
const btnChangeFigure = document.getElementById("btn-change-figure");
// здесь можете проверить и вывести в консоль

let toggle = true;
// при клике на кнопку - вызываю функцию
btnChangeFigure.addEventListener('click', () => {
  if(toggle) {
    divFigureElement.textContent = "Blue circle";
    btnChangeFigure.textContent = "Change to red box";
    divFigureElement.classList.replace("red-box", "blue-circle");
    // divFigureElement.className = "blue-circle";
    // без классов:
    // // как менять стили
    // // css: background-color --> js: backgroundColor
    // // css: border-radius    --> js: borderRadius
    // divFigureElement.style.backgroundColor = "blue";
    // divFigureElement.style.color = "blue";
    // divFigureElement.style.borderRadius = "50%";
  } else {
    divFigureElement.textContent = "Red box";
    btnChangeFigure.textContent = "Change to blue circle"
    // c классами
    divFigureElement.classList.replace("blue-circle", "red-box");
    // без классов:
    // divFigureElement.style.backgroundColor = "lightcoral";
    // divFigureElement.style.color = "black";
    // divFigureElement.style.borderRadius = 0; 
  }
  // меняем значение тогла
  toggle = !toggle;
});




