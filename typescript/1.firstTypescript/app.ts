console.log('Hello!! hi JimJam');

let myName : string = "JimJam";
console.log(myName, typeof myName);

let age : number = 23;
console.log(age, typeof age); 

let mobileNum: 7892315482;
console.log(mobileNum, typeof mobileNum);

let address;

address = "drkfg";


address = 124256;

console.log(address, typeof address);

let calAge = function() : void{
    console.log("age is 26")
}
calAge();

class Person{
    constructor(public name : string , public age : number){

    }
}

let person1 = new Person("mike1" , 24);
console.log(person1);

class Student extends Person{
    constructor(name : string, age : number , public rollNo : number){
super(name,age)
}

}

let person2 = new Student("mike2" ,  23 , 123);
console.log(person2); 