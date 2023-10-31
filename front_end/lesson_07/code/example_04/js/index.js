const createBtnElement = document.getElementById("btn_create");
const removeBtnElement = document.getElementById("remove");

const newElement = document.createElement("p"); // <p></p>
newElement.classList.add("new-paragraph"); // <p class="new-paragraph"></p>
newElement.id = "first_paragraph"; // <p id="first_paragraph" class="new-paragraph"></p>
newElement.textContent = "Текс первого параграфа";
// <p class="new-paragraph" id="first_paragraph">Текс первого параграфа</p>
console.log(newElement);

createBtnElement.addEventListener('click', () => {
  console.log("click");
  document.body.append(newElement);
});

removeBtnElement.addEventListener('click', ()=>{
  newElement.remove();
});


