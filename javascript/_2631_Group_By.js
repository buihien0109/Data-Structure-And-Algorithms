/**
 * @param {Function} fn
 * @return {Object}
 */
Array.prototype.groupBy = function (fn) {
    let ans = {};
    this.forEach(el => {
        let key = fn(el);
        if(ans.hasOwnProperty(key)) {
            ans[key].push(el);
        } else {
            ans[key] = [el];
        }
    })
    return ans
};

console.log([1, 2, 3].groupBy(String)); // {"1":[1],"2":[2],"3":[3]}

const array = [
    { "id": "1" },
    { "id": "1" },
    { "id": "2" }
];
const fn = function (item) {
    return item.id;
}
console.log(array.groupBy(fn));