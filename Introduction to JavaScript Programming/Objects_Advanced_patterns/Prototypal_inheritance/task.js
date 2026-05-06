let car = {
    model: "Audi A6",
    year: 2022,
    color: "cherry",
};

let registeredCar = {
    __proto__: car,
    owner: "Alex",
    numberPlate: "12AB345"
};

let hiredCar = {/* solve the task here */};

console.log(hiredCar.model);   // Audi A6
console.log(hiredCar.owner);   // Alex
console.log(hiredCar.lessee);  // Jacob
