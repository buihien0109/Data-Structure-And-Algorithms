/**
 * @return {null|boolean|number|string|Array|Object}
 */
Array.prototype.last = function () {
    let length = this.length;
    if (length === 0) {
        return -1;
    } else {
        let lastIndex = this.length - 1;
        return this[lastIndex]
    }

};

const arr = [];
console.log(arr.last()); // 3