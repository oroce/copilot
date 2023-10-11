function sumArray(arr: any[]): number {
  let sum = 0;
  for (let i = 0; i < arr.length; i++) {
    if (Array.isArray(arr[i])) {
      sum += sumArray(arr[i]);
    } else {
      sum += arr[i];
    }
  }
  return sum;
}

const arr = [1, 2, [1, 2], [3, 4, [1, 2, 3]]];

const result = sumArray(arr);
console.log(result); // Output: 17
