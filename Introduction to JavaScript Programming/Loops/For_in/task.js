function medalsFilter(/* add parameters here */) {
    let result = [];  // array for keys that satisfy the condition

    // use a for..in loop to iterate over the keys of the medals object

    // don't forget to return the result
}

let medals = {
    usa: 113,
    china: 89,
    australia: 46,
    japan: 58,
    greatBritain: 64,
    canada: 24
};

console.log(medalsFilter(medals, 60));  // [ 'usa', 'china', 'greatBritain' ]