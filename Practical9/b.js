function countBs(str) {
    let count = 0;
    for (let char of str) {
        if (char === 'B') {
            count++;
        }
    }
    return count;
}

// Test it
console.log(countBs("BBC"));
console.log(countBs("Bubble"));
console.log(countBs("BabbleB"));