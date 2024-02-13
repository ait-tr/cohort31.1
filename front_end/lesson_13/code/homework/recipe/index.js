const buttonCheese = document.getElementById("cheese");
const buttonOnions = document.getElementById("onions");
const buttonBacon = document.getElementById("bacon");
const buttonSalad = document.getElementById("salad");
const buttonCutlet = document.getElementById("cutlet");
const buttonBun = document.getElementById("bun");
const buttonKetchup = document.getElementById("ketchup");
const buttonClearRecipe = document.getElementById("clearRecipe");

function addToRecipe() {
  let li = document.createElement("li");
  li.textContent = this.textContent;
  document.getElementById("list").appendChild(li);
}

buttonCheese.addEventListener("click", addToRecipe);
buttonOnions.addEventListener("click", addToRecipe);
buttonBacon.addEventListener("click", addToRecipe);
buttonSalad.addEventListener("click", addToRecipe);
buttonCutlet.addEventListener("click", addToRecipe);
buttonBun.addEventListener("click", addToRecipe);
buttonKetchup.addEventListener("click", addToRecipe);

function clearRecipe() {
  const list = document.getElementById("list");
  // Пока у нас есть firtChild, мы удаляем list.firstChild;
  while (list.firstChild) {
    list.removeChild(list.firstChild);
  }
}
buttonClearRecipe.addEventListener("click", clearRecipe);
