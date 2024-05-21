/**
 * @param {Object|Array} obj
 * @return {Object|Array}
 */
var compactObject = function (obj) {
    if (obj == null) {
        return null;
    }

    if (Array.isArray(obj)) {
        return obj
            .filter(el => Boolean(el))
            .map(el => compactObject(el));
    }

    if (typeof obj !== "object") {
        return obj;
    }

    const compacted = {};
    for (const key in obj) {
        let value = compactObject(obj[key]);
        if (value) compacted[key] = value;
    }

    return compacted;
};

const obj = [null, 0, [false, 1], 1];
console.log(compactObject(obj));

const obj1 = { "a": null, "b": [false, 1] }
console.log(compactObject(obj1));