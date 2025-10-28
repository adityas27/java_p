// the console script 
const pricePerDonut = 25;

let quantityInput = prompt("Enter the quantity of donuts (number, 'dozen', or 'half dozen'):");
let quantity;

const input = quantityInput.trim().toLowerCase();

if (input === "dozen") {
    quantity = 12;
} else if (input === "half dozen") {
    quantity = 6;
} else {
    quantity = parseInt(input, 10);
    if (isNaN(quantity) || quantity <= 0) {
        console.log("Invalid input. Please enter a positive number, 'dozen', or 'half dozen'.");
    }
}

const subtotal = pricePerDonut * quantity;
console.log(`Subtotal for ${quantity} donuts: ${subtotal}`);