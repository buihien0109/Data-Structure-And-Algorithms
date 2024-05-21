/**
 * @param {number[]} nums
 * @return {void}
 */
var ArrayWrapper = function (nums) {
    this.nums = nums;
};

/**
 * @return {number}
 */
ArrayWrapper.prototype.valueOf = function () {
    return this.nums.reduce((a, b) => a + b, 0)
}

/**
 * @return {string}
 */
ArrayWrapper.prototype.toString = function () {
    return `[${this.nums.toString()}]`;
}

const obj1 = new ArrayWrapper([1, 2]);
const obj2 = new ArrayWrapper([3, 4]);
console.log(obj1 + obj2); // 10
console.log(obj1.toString());; // "[1,2]"
console.log(obj2.toString());; // "[3,4]"