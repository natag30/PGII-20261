function createBadge(template, participantName) {
    let result = {};
    // Using Object.assign() solve the task
    return result;
}

let template= {
    name: "<>",
    company: "JetBrains",
    event: "JavaScript Day",
    year: 2025
};

let bob = createBadge(template, "Bob");
let alice = createBadge(template, "Alice");
let john = createBadge(template, "John");

console.log(bob);   // { name: 'Bob', company: 'JetBrains', ... }
console.log(alice); // { name: 'Alice', company: 'JetBrains', ... }
console.log(john);  // { name: 'John', company: 'JetBrains', ... }
