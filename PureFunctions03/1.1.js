function addToCart(cartItems, item) {
    return [...cartItems, item];
}

let cartItems = [];
console.log(addToCart(cartItems, 'Apple'));
console.log(addToCart(cartItems, 'Banana'));
console.log(addToCart(cartItems, 'Orange'));
