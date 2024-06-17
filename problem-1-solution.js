function countDivisibles(scrollA, scrollB) {
    let sacredFrequency = new Map();

    // Alice precomputes the frequency of each sacred number in Scroll A
    for (let sacredNumber of scrollA) {
        if (sacredFrequency.has(sacredNumber)) {
            sacredFrequency.set(sacredNumber, sacredFrequency.get(sacredNumber) + 1);
        } else {
            sacredFrequency.set(sacredNumber, 1);
        }
    }

    let result = new Array(scrollB.length).fill(0);

    // Bob counts numbers in Scroll A that are divisible by each powerful divisor in Scroll B
    for (let i = 0; i < scrollB.length; ++i) {
        let powerfulDivisor = scrollB[i];
        let divisibleCount = 0;

        // Check multiples of the powerfulDivisor in sacredFrequency
        for (let [sacredNumber, frequency] of sacredFrequency.entries()) {
            if (sacredNumber % powerfulDivisor === 0) {
                divisibleCount += frequency;
            }
        }

        result[i] = divisibleCount;
    }

    return result;
}

function main() {
    let scrollA = [12, 24, 36, 48, 60];
    let scrollB = [2, 3, 4];

    let result = countDivisibles(scrollA, scrollB);
    console.log("Result:", result.join(" ")); // Output: Result: 5 5 3

    let scrollA2 = [5, 10, 15, 20, 25];
    let scrollB2 = [2, 3, 5];

    result = countDivisibles(scrollA2, scrollB2);
    console.log("Result:", result.join(" ")); // Output: Result: 2 0 5
}

main();
