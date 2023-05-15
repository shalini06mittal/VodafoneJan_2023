// // named function
// function greet()
// {
//     console.log('heelo');
// }
// greet();
// function greetUser(name)
// {
//     console.log('heelo',name);
// }
// greetUser('Shalini')
// function welUser(name)
// {
//     return 'heelo '+name;
// }

// console.log(welUser('Denisa'))

// function add(n1, n2, n3)
// {
//     console.log(n1, n2, n3);
// }

// add();
// add(1);
// add(1,2);
// add(1,2,3);
// add(1,3,4,5,6,8 );

// // IIFE => immediately invoked function expression
// (
//     function()
//     {
//         alert('heyy from IIFE');
//     }
// )//();
// // function expressions
// var f = function(){
//     console.log('good day');
// }

// console.log(typeof(f));
// console.log(f);
// var x = 10;
// f();
// console.log(f());

function outer()
{
    console.log('OUTER');
    function inner()
    {
        console.log('INNER');
    }
    return inner;
}

//outer()();

function square(no)
{
    return no*no;
}
function mul(n1, n2 = 1)
{
    return n1*n2;
}

function calculate(nos, func,multiple ) // func = 
{
    console.log(func)
    for(let n of nos)
        console.log(func(n, multiple));
}
calculate([2,6,7,9,15,16],  square);
calculate([2,6,7,9,15,16],  mul, 3);

// lambdas => arrow functions?