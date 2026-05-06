async function generator(number) {
  return new Promise((resolve) => {
    setTimeout(() => resolve(number), number);
  });
}

async function collector(number1, number2) {
  let arr = [];
  number1.then((x) => arr.push(x));
  number2.then((x) => arr.push(x));
  return arr;
}

collector(generator(100), generator(200)).then(console.log);
