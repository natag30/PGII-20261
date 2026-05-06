function arrayProcessor(array, transform) {
  // Apply `transform` to each element of the `array`
}

let arr = [1, 2, 3, 4, 5];

arrayProcessor(arr, (x) => x * 2);
console.log(arr); // [ 2, 4, 6, 8, 10 ]

arrayProcessor(arr, (x) => -x);
console.log(arr); // [ -2, -4, -6, -8, -10 ]

arrayProcessor(arr, (x) => x ** 2);
console.log(arr); // [ 4, 16, 36, 64, 100 ]
