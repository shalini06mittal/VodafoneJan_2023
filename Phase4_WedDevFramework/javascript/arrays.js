let nos = [1,2,3,4,5]
console.log( nos);
console.log(typeof(nos))
let sum = 0;
for(let i=0;i<nos.length;i++)
{
        console.log(nos[i])
        sum += nos[i];
}
console.log('total ', sum)

for(let v in nos) // in gives access to index
    console.log(v, nos[v]*nos[v])

for(let v of nos) // of gives access to array values
    console.log(v, v*v)

// w3schools
// console.log(nos[50]);
// nos[50] = 100;
// console.log(nos.length)
// console.log(nos)
document.write('<h3>nos : '+nos+'</h3>');
nos.push(46);
document.write('<h3> PUSH '+nos+'</h3>');
nos.shift()
document.write('<h3> SHIFT '+nos+'</h3>');
nos.unshift(67)
document.write('<h3> UNSHIFT '+nos+'</h3>');
nos.pop()
document.write('<h3> POP '+nos+'</h3>');
nos.splice(2,1) // start from index 2 and remove 1 element
document.write('<h3> SPLICE 2,1 =>  '+nos+'</h3>');
nos.splice(2,1,90, 95) // start from index 2 and remove 1 element
document.write('<h3> SPLICE 2,1, 90, 95 =>  '+nos+'</h3>');
nos.splice(2,0,9, 7) // start from index 2 and remove 1 element
document.write('<h3> SPLICE 2,0, 9, 7 =>  '+nos+'</h3>');
