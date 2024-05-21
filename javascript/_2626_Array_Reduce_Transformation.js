/**
 * @param {number[]} nums
 * @param {Function} fn
 * @param {number} init
 * @return {number}
 */
var reduce = function(nums, fn, init) {
    if(nums.length === 0) {
        return init;
    }

    nums.forEach(num => {
        init = fn(init, num);
    });

    return init;
};

// Test 1
const nums = [1,2,3,4]
const fn = function sum(accum, curr) { return accum + curr; }
const init = 0
console.log(reduce(nums, fn, init));