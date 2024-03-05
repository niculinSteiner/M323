function alphabeticallySort(list) {
    if (list.length <= 1) {
        return list;
    }

    const minIndex = list.reduce((minIdx, current, idx, arr) => {
        if (current < arr[minIdx]) {
            return idx;
        } else {
            return minIdx;
        }
    }, 0);

    const temp = list[0];
    list[0] = list[minIndex];
    list[minIndex] = temp;

    return [list[0]].concat(alphabeticallySort(list.slice(1)));
}

const myList = ["banana", "apple", "orange", "grape"];
console.log("Sortierte Liste:", alphabeticallySort(myList));
