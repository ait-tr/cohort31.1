// Создайте классы: Plant, Rose.  
// Роза должна наследовать Растение.
// Пусть у растения будут поля: 
// - рост, 
// - возраст.   


// И метод grow, который увеличивает его рост на 10 см.  


// У розы должно быть поле - количество бутонов (numberOfFlowers).
// Создайте объект класса розы, вызовите метод.

class Plant {
  constructor(height, age){
    this.height = height;
    this.age = age;
  }
  grow(){
    // console.log(this.height + 10);
    this.height += 10;
  }
}

class Rose extends Plant{
  constructor(height, age, numberOfFlowers){
    super(height, age);
    this.numberOfFlowers = numberOfFlowers;
  }
}

const oak = new Plant(200, 6);
oak.grow();
console.log(oak);

const rose = new Rose(130, 3, 20);
console.log(rose);
rose.grow();
console.log(rose);

// object literal
const x = {height: 120, age: 3};
// console.log();

class MyUtil{
  static x;
  static staticPrint(){
    console.log(x);
  }
}

MyUtil.staticPrint();
