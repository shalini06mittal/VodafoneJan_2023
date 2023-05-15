let employee = {'name':'shalini','phone':'56789',age:30};
console.log(employee)
console.log(employee['age'])
employee['name'] = 'shalini mittal'
employee['city'] = 'Mumbai'
console.log(employee)
let keys = Object.keys(employee)
console.log(keys)
for (let key of keys)
{
    console.log(key, employee[key])
}

var employees = [
    {'name':'shalini','phone':'56789',age:30},
    {'name':'abhishekh','phone':'131223123',age:20},
    {'name':'mysha','phone':'676744556',age:50},
    {'name':'vivek','phone':'456456456',age:10},
]
/**
 * Name     Phone   Age
 * shalini  56789
 * abhishekh
 */