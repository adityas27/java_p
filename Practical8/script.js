function validateEmail() {
  const emailInput = document.getElementById("email");
  const email = emailInput.value.trim();

  if (email === "") {
    alert("Please enter your email address.");
    emailInput.focus();
    return false;
  }

  if (email.indexOf("@") === -1 || email.indexOf(".") === -1) {
    alert("Invalid email address. Please include '@' and '.' characters.");
    emailInput.focus();
    return false;
  }

  alert("Email is valid! Thank you for subscribing.");
  emailInput.value = "";
  return true;
}
function showMessage() {
  const message = document.getElementById("message");
  message.textContent = "Thank you for clicking! Enjoy browsing.";
  message.style.color = "#007acc";
}