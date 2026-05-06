let book = {
    title: "1984",
    author: "George Orwell",
    year: 1949
};

Object.defineProperty(book, "summary", {
    /* Complete the property to return "Title by Author, published in Year" */
});

console.log(book); // { title: "1984", author: "George Orwell", year: 1949 }
console.log(book.summary); // "1984 by George Orwell, published in 1949"
