const _ = require("lodash");

let cars = [
    {
        model: "Volkswagen Golf",
        year: 2016
    },
    {
        model: "Audi A6",
        year: 2022
    },
    {
        model: "Volvo XC70",
        year: 2015
    },
    {
        model: "Audi A6",
        year: 2022
    },
];

function countCars(cars, car) {
    let count = 0;
    // Iterate over the array elements and increment count in case of equality
    // Don't forget to return the count as a result
}

let car = {
    model: "Audi A6",
    year: 2022
};

console.log(countCars(cars, car));  // should print "2"
