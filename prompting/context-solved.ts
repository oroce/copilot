// Map through an array of arrays of objects to transform data
// Map through an array of arrays of objects to transform data, desired output: ['John', 'Jane', 'Bob']
const data = [
  [
    { name: 'John', age: 25 },
    { name: 'Jane', age: 30 }
  ],
  [
    { name: 'Bob', age: 40 }
  ]
];
// first prompt

const transformedData = data.map((arr) =>
  arr.map((obj) => ({
    firstName: obj.name,
    age: obj.age,
    isAdult: obj.age >= 18
  }))
);
// second prompt
const names = data.flatMap(arr => arr.map(obj => obj.name));

console.log(names); // Output: ['John', 'Jane', 'Bob']