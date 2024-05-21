/**
 * @param {number[]} arr
 * @param {Function} fn
 * @return {number[]}
 */
var filter = function (arr, fn) {
    let ans = [];
    arr.forEach((el, index) => {
        const val = fn(el, index);
        if (val) {
            ans.push(el)
        }
    })
    return ans
};

const arr = [0, 10, 20, 30]
const fn = function greaterThan10(n) { return n > 10; }
console.log(filter(arr, fn));

const arr1 = [-2,-1,0,1,2]
const fn1 = function plusOne(n) { return n + 1 }
console.log(filter(arr1, fn1));