/**
 * @param {number} millis
 * @return {Promise}
 */

async function sleep(millis) {
    setTimeout(() => {
        return millis;
    }, millis);
}

async function sleep(millis) {
    return new Promise((resovle, reject) => {
        setTimeout(() => {
            return resovle(millis);
        }, millis);
    })
}


let t = Date.now()
sleep(100).then(() => console.log(Date.now() - t)) // 100
