function generateNumbersPromise() {
  return new Promise((resolve) => {
    resolve([2, 4, 6, 8, 10]);
  });
}

function summarizeNumbers(numbersPromise) {
  return numbersPromise.then(function (numbers) {
    // Calculate the sum and return it as the result
  });
}

summarizeNumbers(generateNumbersPromise()).then(
  (result) => console.log(result), // 30
);
