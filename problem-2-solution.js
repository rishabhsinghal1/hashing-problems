function findMinimalSize(array) {
    let uniqueElements = new Set(array);
    return uniqueElements.size;
}

function main() {
    let testcase1 = [1, 2, 3, 2, 1];
    let testcase2 = [1, 1, 1, 1];
    
    console.log(findMinimalSize(testcase1)); // Output: 3
    console.log(findMinimalSize(testcase2)); // Output: 1
}

main();
