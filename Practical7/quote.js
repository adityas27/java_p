const quotes = [
  "Believe you can and you're halfway there. – Theodore Roosevelt",
  "Your limitation—it’s only your imagination.",
  "Push yourself, because no one else is going to do it for you.",
  "Success doesn’t just find you. You have to go out and get it.",
  "It always seems impossible until it’s done. – Nelson Mandela",
  "Why don’t scientists trust atoms? Because they make up everything!",
  "Be stronger than your excuses.",
  "Dream it. Wish it. Do it.",
  "Don’t watch the clock; do what it does. Keep going. – Sam Levenson",
  "I told my computer I needed a break… and it froze me out!"
];

function newQuote() {
  const randomIndex = Math.floor(Math.random() * quotes.length);
  document.getElementById("quote").textContent = quotes[randomIndex];
}