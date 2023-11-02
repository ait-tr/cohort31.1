// Прототипное наследование является нативным для JS
// шок-контент: отношение наследования между двумя объектами
// где один объект будет выступать как прототип для друго

const bike = {
  brand: "Gazelle",
  drive(){
    console.log("bsh-br-br");
  }
};

const mountainBike = {
  __proto__: bike,
  brand: "Stels",
  gears: 20,
  price: 600
}

console.log(mountainBike);
console.log(mountainBike.brand); // Gazelle 