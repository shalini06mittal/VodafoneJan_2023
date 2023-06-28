var fruits=['apple','oranges','grapes','mangoes'];

let res = fruits.map(
    (fruit)=>
     fruit.endsWith('s') ? fruit.concat(' are good')
    :fruit.concat(' is good')
)
console.log(fruits)
console.log(res)

var employees = [
    {'name':'shalini','phone':'56789',age:30},
    {'name':'abhishekh','phone':'131223123',age:20},
    {'name':'mysha','phone':'676744556',age:50},
    {'name':'vivek','phone':'456456456',age:10},
]
var emps = employees.map(employee => employee.name[0].toUpperCase() + employee.name.substring(1));
console.log(emps)

fruits.forEach(fruit => console.log(fruit))

console.log(employees.filter(employee => employee.age >=30));

console.log(employees.findIndex(employee => employee.name==='shalini'))
console.log(employees.findIndex(employee => employee.name==='sia'))

console.log(employees.find(employee => employee.name==='vivek'))
console.log(employees.find(employee => employee.name==='denisa'))