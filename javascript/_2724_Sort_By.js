/**
 * @param {Array} arr
 * @param {Function} fn
 * @return {Array}
 */
var sortBy = function(arr, fn) {
    return arr.sort((a, b) => fn(a) - fn(b));
};

// Test 1
const arr = [5, 4, 1, 2, 3];
const fn = (x) => x;
console.log(sortBy(arr, fn));

// Test 2
const arr1 = [[3, 4], [5, 2], [10, 1]];
const fn1 = (x) => x[1];
console.log(sortBy(arr1, fn1));