function square(no)
{
    return no * no;
}

let sq = function(no)
{
    return no * no;
}
console.log(square(10));
console.log(sq(5));
/**
 * 1. input => parameters
 * 2. output : return
 * 3. BL : body of the function
 */
// let cube = (n) => {
//     return n*n*n;
// }
let cube = (n) => n*n*n;
 

console.log(cube(7))
function calculate(nos, func,multiple ) // func = 
{
    console.log(func)
    for(let n of nos)
        console.log(func(n, multiple));
}
arr = [1,2,3,4,5]
calculate(arr, (v) => Math.sqrt(v))

let convert = (str='') => {
    if(str.length <=3)
        return "Hey length should be greater than 3";
    else
        return str.toUpperCase();
}

console.log(convert('Hey'))
console.log(convert('Hello'))