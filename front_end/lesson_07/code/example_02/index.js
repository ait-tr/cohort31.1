const helloElement = document.getElementById("hello");
const pandaImgElement = document.getElementById("panda");
// console.log(helloElement); // вывели в консоль, чтобы
// убедиться, что получили желаемый элемент
// console.log(pandaImgElement);

// Теперь мы можем менять этот элемент
// textContent - мы текст при помощи этого поля
helloElement.textContent = "Goodbye";
//helloElement.textContent += " and Goodbye";
// поменяли значение атрибута src, так же можно менять любой другой атрибут других тегов
pandaImgElement.src = "https://upload.wikimedia.org/wikipedia/commons/thumb/0/0f/Grosser_Panda.JPG/440px-Grosser_Panda.JPG"
// className
// class="previous"
pandaImgElement.className = "panda-img"; // "panda-img"  то есть здесь затрутся все остальные классы, если они было
pandaImgElement.classList.add("new"); // "panda-img new" добавляет классы к тем, которые уже были
pandaImgElement.classList.remove("panda-img"); // "new"

