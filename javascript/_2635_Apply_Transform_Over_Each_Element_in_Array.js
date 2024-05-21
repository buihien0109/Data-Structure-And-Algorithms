/**
 * @param {number[]} arr
 * @param {Function} fn
 * @return {number[]}
 */
var map = function (arr, fn) {
    let returnedArray = [];
    arr.forEach((v, i) => {
        returnedArray.push(fn(v, i));
    })
    return returnedArray
};

const arr = [1, 2, 3];
const fn = function plusone(n) { return n + 1; }
console.log(map(arr, fn));

const arr1 = [1, 2, 3]
const fn1 = function plusI(n, i) { return n + i; }
console.log(map(arr1, fn1));