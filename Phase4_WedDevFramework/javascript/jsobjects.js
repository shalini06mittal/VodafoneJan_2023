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
keys = Object.keys(employees[0])
let str = '<table border="1"><tr>';
// template literals
for (let key of keys)
    //document.write(key+'&nbsp;&nbsp;&nbsp;&nbsp;')
    str += `<th>
        ${key}</th>`
str+= '</tr>';
for (let emp of employees)
{
    //document.write('</p>');
    str += '<tr>'
    for (let key of keys)
        //document.write(emp[key]+'&nbsp;&nbsp;&nbsp;&nbsp;');
        str += `<td>
        ${emp[key]}</td>`
    //document.write('</p>');
    str += '</tr>';
}
str+='</table>'
document.write(str)