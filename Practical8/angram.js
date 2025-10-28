function areAnagrams(str1, str2) {
    if (str1.length !== str2.length) {
        return false;
    }

    const frequency = str => {
        const freq = {};
        for (let char of str.toLowerCase()) {
            freq[char] = (freq[char] || 0) + 1;
        }
        return freq;
    };

    const freq1 = frequency(str1);
    const freq2 = frequency(str2);

    for (let char in freq1) {
        if (freq1[char] !== freq2[char]) {
            return false;
        }
    }

    return true;
}

let string1 = prompt("Enter the first string:");
let string2 = prompt("Enter the second string:");

if (areAnagrams(string1, string2)) {
    console.log("The strings are anagrams.");
} else {
    console.log("The strings are not anagrams.");
}
