class Point{
    constructor(x, y) {
        this.x = x;
        this.y = y;
    }

    distanceFromOrigin() {
        return Math.sqrt(this.x * this.x + this.y * this.y);
    }
}

class Point3D extends Point{
    constructor(x, y, z) {
        // implement the constructor
    }

    // overriding the distanceFromOrigin() method
}

let p1 = new Point3D(3, 4, 12);
let p2 = new Point3D(24, 24, 23);

console.log(p1.distanceFromOrigin());  // 13
console.log(p2.distanceFromOrigin());  // 41
