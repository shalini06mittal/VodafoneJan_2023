//alert("Thanks for dropping on ny website"); // informative dialog bpox

// // prompt => user input
// let username = prompt("Enter your name");
// // DOM -> document object model
// document.write("<h1>Welcome**"+username+"**</h1>");

let no1 = parseInt(prompt("enter number 1"));
let no2 = parseFloat(prompt("enter number 2"));
console.log(typeof no1);
console.log(no1 + no2);
console.log(no1 - no2);
console.log(no1 / no2);
console.log(no1 * no2);

let choice = confirm("Are you sure, you want to go to contact?");
if (choice) {
  //  alert("Thanks");
  window.location.href = 'http://127.0.0.1:5500/javascript/contact.html'
}
else {
  alert("Np");
}

switch (no1) {
  case 1:
    alert("ONE");
    break;
  case 2:
    alert("TWO");
    break;
  case 3:
    alert("THREE");
    break;
}
