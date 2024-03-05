//1.4 verwendet Math.random(), welches nicht pure sein kann.

function multiplyWithRandom(number, randomValue) {
        return number * randomValue;
}

console.log(multiplyWithRandom(5, Math.random())); // Ausgabe: Eine zufällige Zahl zwischen 0 und 5
console.log(multiplyWithRandom(10, Math.random())); // Ausgabe: Eine zufällige Zahl zwischen 0 und 10
