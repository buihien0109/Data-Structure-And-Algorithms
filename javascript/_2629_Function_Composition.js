/**
 * @param {Function[]} functions
 * @return {Function}
 */
var compose = function(functions) {
    
    return function(x) {
        if(functions.length === 0) {
            return x;
        }

        let ans = x;
        for (let i = functions.length - 1; i >= 0; i--) {
            ans = functions[i](ans);
        }
        return ans;
    }
};

// Test 1
const fn = compose([x => x + 1, x => 2 * x]);
console.log(fn(4)); // 9

// Test 2
const fn1 = compose([x => 10 * x, x => 10 * x, x => 10 * x])
console.log(fn1(1)); // 1000

// Test 3
const fn2 = compose([]);
console.log(fn2(42));