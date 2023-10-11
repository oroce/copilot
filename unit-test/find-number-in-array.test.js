// BEGIN: 9d3f8a1fjw3d
const findNumberInArray = require('./find-number-in-array');

describe('findNumberInArray', () => {
  it('should return true if the number is in the array', () => {
    const array = [1, 2, 3, 4, 5];
    const number = 3;
    const result = findNumberInArray(array, number);
    expect(result).toBe(true);
  });

  it('should return false if the number is not in the array', () => {
    const array = [1, 2, 3, 4, 5];
    const number = 6;
    const result = findNumberInArray(array, number);
    expect(result).toBe(false);
  });

  it('should return true if the number is the first element of the array', () => {
    const array = [1, 2, 3, 4, 5];
    const number = 1;
    const result = findNumberInArray(array, number);
    expect(result).toBe(true);
  });

  it('should return true if the number is the last element of the array', () => {
    const array = [1, 2, 3, 4, 5];
    const number = 5;
    const result = findNumberInArray(array, number);
    expect(result).toBe(true);
  });

  it('should return false if the array is empty', () => {
    const array = [];
    const number = 1;
    const result = findNumberInArray(array, number);
    expect(result).toBe(false);
  });

});
// END: 9d3f8a1fjw3d