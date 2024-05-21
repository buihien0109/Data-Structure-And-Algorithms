/**
 * @param {Promise} promise1
 * @param {Promise} promise2
 * @return {Promise}
 */
var addTwoPromises = async function(promise1, promise2) {
    let ans = await Promise.all([promise1, promise2]);
    return ans[0] + ans[1];
};

addTwoPromises(Promise.resolve(2), Promise.resolve(2))
    .then(console.log); // 4