let colors = ["red", "blue", "green", "yellow"];
console.log(colors);    // prints [ 'red', 'blue', 'green', 'yellow' ]

console.log(colors[0]);  // prints "red"
console.log(colors[3]);  // prints "yellow"
colors[1] = "purple";    // replaces "blue" with "purple"
console.log(colors[1]);  // prints "purple"
colors[4] = "pink";      // adds a new element to the array
console.log(colors);     // [ 'red', 'purple', 'green', 'yellow', 'pink' ]

// Add "brown" to the end of colors array
// Add "black" to the end of colors array

console.log(colors);     // should be [ 'red', 'purple', 'green', 'yellow', 'pink', 'brown', 'black' ]
