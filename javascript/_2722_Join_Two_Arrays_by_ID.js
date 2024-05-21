/**
 * @param {Array} arr1
 * @param {Array} arr2
 * @return {Array}
 */
// var join = function (arr1, arr2) {
//     const ans = [...arr1];
//     for (let i = 0; i < arr2.length; i++) {
//         // Kiem tra xem id co ton tai hay chua
//         let isFound = false;
//         let j = 0;
//         while (j < ans.length) {
//             if (arr2[i].id === ans[j].id) {
//                 isFound = true;
//                 break;
//             }
//             j++;
//         }

//         // Neu co -> cap nhat
//         if (isFound) {
//             ans[j] = { ...ans[j], ...arr2[i] }
//         } else {
//             ans.push(arr2[i]);
//         }

//         // Neu khong -> push
//     }
//     return ans.sort((a, b) => a.id - b.id);
// };

// var join = function (arr1, arr2) {
//     let ans = [...arr1, ...arr2];
//     let j = 1;
//     for (let i = 0; i < ans.length;) {
//         if (j < ans.length) {
//             if (ans[i].id === ans[j].id) {
//                 ans[i] = { ...ans[i], ...ans[j] };
//                 ans.splice(j, 1);
//             } else {
//                 i++;
//                 j++;
//             }
//         }
//     }
//     return ans;
// }

var join = function (arr1, arr2) {
    const rs = {};
    for (let i = 0; i < arr1.length; i++) {
        let key = arr1[i].id;
        rs[key] = arr1[i];
    }

    for (let i = 0; i < arr2.length; i++) {
        let key = arr2[i].id;
        if (rs.hasOwnProperty(key)) {
            rs[key] = { ...rs[key], ...arr2[i] };
        } else {
            rs[key] = arr2[i];
        }
    }
    return Object.values(rs);
};

const arr1 = [
    { id: 1, x: 2, y: 3 },
    { id: 2, x: 3, y: 6 },
];
const arr2 = [
    { id: 2, x: 10, y: 20 },
    { id: 3, x: 0, y: 0 },
];

console.log(join(arr1, arr2));
