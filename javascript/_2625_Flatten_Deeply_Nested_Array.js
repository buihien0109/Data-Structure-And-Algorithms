/**
 * @param {Array} arr
 * @param {number} depth
 * @return {Array}
 */
// var flat = function (arr, depth) {
//     function flattenHelper(currentArr, currentDepth) {
//         let result = [];
//         for (let element of currentArr) {
//             if (Array.isArray(element) && currentDepth < depth) {
//                 result = result.concat(flattenHelper(element, currentDepth + 1));
//             } else {
//                 result.push(element);
//             }
//         }
//         return result;
//     }

//     return flattenHelper(arr, 0);
// }

var flat = function (arr, depth) {
    const stack = arr.map(item => ({ item, currentDepth: 0 }));
    const result = [];

    while (stack.length) {
        const { item, currentDepth } = stack.pop();

        if (Array.isArray(item) && currentDepth < depth) {
            stack.push(...item.map(subItem => ({ item: subItem, currentDepth: currentDepth + 1 })));
        } else {
            result.push(item);
        }
    }

    return result.reverse();
}




const arr = [1, 2, 3, [4, 5, 6], [7, 8, [9, 10, 11], 12], [13, 14, 15]]
const n = 1
console.log(flat(arr, n));