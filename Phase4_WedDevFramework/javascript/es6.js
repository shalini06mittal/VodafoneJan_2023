// https://ultimatecourses.com/blog/all-about-immutable-arrays-and-objects-in-javascript

// https://www.javascripttutorial.net/es6/


function power(p=2, base)
{
    return base**p;
}
console.log(power(5, 5))

// array destructuring

var scores = [10, 12, 11]
var s1 = scores[0]
var s2 = scores[1]
var s3 = scores[2]
console.log(s1, s2, s3)

let [a1,a2, a3, a4] = scores;
console.log(a1, a2, a3, a4)

// js objects destructuring

let product = {'id':1, 'prodname':'laptop', 'price':768876};

 let pid = product.id
 let pname = product['name']

//  let {id, prname, price} = product;
//  console.log(id, prname, price)

let {id, price, prodname} = product;
 console.log(id, prodname, price)

 // spread operator
 let colors = ['red','green','blue','yellow']
 let morecolors = ['black','white']
 colors.push(...morecolors)
 console.log(colors)

 let n1 = [1,2,3]
 let n2 = [4,5,6,...n1]
 console.log(n2)

 let vowels = [...'aeiou']
 console.log(vowels)

 let student = {'id':1, 'name':'shalini',
    "phnos":[123, 234, 345]}
 let st1 = student;

 console.log(st1)
 console.log(student)
 st1.name = 'Priya'
 console.log(st1)
 console.log(student)

 let st2 = {...student, "phnos":[...student.phnos]} // shallow cloning
 
 
 console.log(st2)
 console.log(student)
 st2.name='Michaela';
 st2.phnos[0] = 999;
 console.log(st2)
 console.log(student)

 // rest parameters => function arguments

 function data(n, ...val)
 {
    console.log(n, val);
 }
data(1,2,3,4,5,6,7,8,9, 10)

// class concept
class Employee{
    constructor( name, city){
        this.name = name;
        this.city = city;
    }
    showDetails(){
        console.log(`Name : ${this.name} City : ${this.city}`);
    }
}
class Developer extends Employee{
    constructor(name , city){
        super(name, city);
        this.projectname = 'Risk Management';
    }
    showDetails(){
        super.showDetails();
        console.log('Project name ',this.projectname);
    }
}
let emp = new Employee('Shalini', 'Mumbai');
emp.showDetails();
let dev = new Developer('Maya', 'Pune')
dev.showDetails();


var employees = [
    {'name':'shalini','phone':'56789',age:30, 'city':'Pune'},
    {'name':'abhishekh','phone':'131223123',age:20, 'city':'Mumbai'},
    {'name':'mysha','phone':'676744556',age:50, 'city':'Pune'},
    {'name':'vivek','phone':'456456456',age:10, 'city':'Pune'},
]

console.log(employees.every(emp => emp.city === 'Pune'));
console.log(employees.some(emp => emp.city === 'Pune'));

var itemamount = [100, 200, 150, 180, 300];

let sum = 0;
for(let amt of itemamount)
{
    sum += amt;
}
console.log(sum)

let total = itemamount.reduce((sum, amt)=> {
    console.log(sum, amt)
    sum += amt;
    return sum;
});
console.log(total)


let names =['Shalini', 'Manisha','Denisa'];

let updatednames = names.reduce((pn, cn)=> pn+' '+cn);
console.log(updatednames)
