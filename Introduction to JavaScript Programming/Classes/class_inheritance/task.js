class Vehicle {
    constructor(brand, year) {
        this.brand = brand;
        this.year = year;
    }

    getVehicleInfo() {
        return this.brand + " " + this.year;
    }
}

class Truck extends Vehicle {
    constructor(brand, year, payload) {
        // remember to call base class constructor
    }

    getPayload() {
        // return payload value
    }
}

let truck = new Truck("Ford", 2015, 7500);
console.log(truck.getVehicleInfo());  // Ford 2015
console.log(truck.getPayload());     // 7500
