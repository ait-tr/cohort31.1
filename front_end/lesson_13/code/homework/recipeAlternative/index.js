const allButtons = document.querySelectorAll(".add");
const ul = document.querySelector(".burger");
const list_li = ul.querySelectorAll("li");
const del = document.querySelector(".del");

allButtons.forEach(function (btn) {
  btn.addEventListener("click", function (e) {
    console.log(e.target.value);
    const li = document.createElement("li");
    li.innerHTML = e.target.value;
    ul.append(li);
  });
});

del.addEventListener("click", function () {
  const nodeList = document.querySelectorAll("li");
  for (const node of nodeList) {
    node.remove();
  }
});
