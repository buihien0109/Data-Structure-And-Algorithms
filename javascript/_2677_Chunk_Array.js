/**
 * @param {Array} arr
 * @param {number} size
 * @return {Array}
 */
var chunk = function(arr, size) {
    let ans = [];
    let index = 0;
    let length = arr.length;
    while(index < length) {
        let sub = arr.slice(index, index + size);
        ans.push(sub);
        index += size;
    }
    return ans;
};

console.log(chunk([1,2,3,4,5], 6));
