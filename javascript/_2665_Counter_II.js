/**
 * @param {integer} init
 * @return { increment: Function, decrement: Function, reset: Function }
 */
var createCounter = function(init) {
    const initCopy = init;
    return {
        increment() {
            return ++init;
        },
        reset() {
            return init = initCopy;
        },
        decrement() {
            return --init;
        }
    }
};

const counter = createCounter(5)
console.log(counter.increment()); // 6
console.log(counter.reset()); // 5
console.log(counter.decrement()); // 4