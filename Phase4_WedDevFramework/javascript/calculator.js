function process()
{
    let n1ele = document.getElementById('n1');
    let n2ele = document.getElementById('n2');
    console.log(n1ele);
    console.log(n2ele);
    let n1 = n1ele.value;
    let n2 = n2ele.value;
    let resele = document.getElementById('res');
    let sum =parseFloat(n1) + parseFloat(n2);
    resele.innerText = 'Result : '+sum;
}
/**
 * 
 * 1. on click of button based on the operator selected
 * calculate and display the result
 * 
 * 2. the moment the user selects an operator calculate and display the result
 */