// ## Homework
// ### Задание 1
// Создайте массив из следующих элементов: "Семен", "Иван", "Петр", "Татьяна". 
// Создайте еще один массив с возрастами: 18, 27, 74, 34; Создайте и заполните 
// при помощи цикла этот новый массив новыми элементами по образу: "Семен 18 лет/годов"

// ### Задание 2
// Используя пройденные на занятии методы массива получите из этого массива новый массив, 
// в котором элементы идут в обратной последовательности.

// Ответ присылайте в личку в слак.
// Задание 1
const names = ["Семен", "Иван", "Петр", "Татьяна"];
const ages = [18, 27, 74, 34];

const descriptions = [];

for(let i = 0; i < names.length; i++){
  let description = names[i] + " " + ages[i] + " лет/годa";
  descriptions.push(description);
  // descriptions[i] = description;
}

// Задание 2
console.log(descriptions);
// ['Семен 18 лет/годa','Иван 27 лет/годa','Петр 74 лет/годa','Татьяна 34 лет/годa']

// const reversed = descriptions.reverse();
// console.log(reversed);
const reversed = [];
for(let i = descriptions.length - 1; i >= 0; i--){
  reversed.push(descriptions[i]);
};

const arr = new Array(20);
arr.fill("*");
// arr.fill("*", 5, 7); // c 5 включительно по 7 не включительно 
console.log(arr);

console.log(reversed);

console.log(reversed[4]); // undefined