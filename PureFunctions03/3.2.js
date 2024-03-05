function calculateMeanRecursivePure(list, sum = 0, index = 0) {
    if (index === list.length) {
        if (list.length === 0) {
            return undefined;
        } else {
            return sum / list.length;
        }
    }
    const newSum = sum + list[index];
    return calculateMeanRecursivePure(list, newSum, index + 1);
}
const myList = [1, 2, 3, 4, 5];
console.log(calculateMeanRecursivePure(myList));
