// named functions
function  add(num1 , num2) 
{
    console.log('sum:',num1+num2);
}

add(10,13);

//Function Expression (Anonymous)

var sub = function(num1,num2)   
{
  var subValue = num1-num2;
        return subValue;
}

var value = sub(20,10)
        console.log('value =' , value);

console.log("======================");

console.log('hello'); // semicolon is mandatory..


// Self invoked functions

(function add(num1,num2){

  console.log('value=', num1+num2);
}) (10,20)

//fat arrow funtions
var div = (num1,num2) => {
  console.log('value=',num1/num2);
} 

div(10,5);

// fat arrow func 2 without paranthesis

var div = num1 =>{
  console.log('value',num1);
} 
div(10);

// fat arrow func 4 with automatically called return type
var add = (num1,num2) => num1+num2;
console.log('value:',add(10,20));

 var div1 = num1=> console.log(num1);
 div1(10);

 // return statement added before statement of code
  
 var value = add(10,40);
 console.log(value);

 console.log("====================j")

 greeting('Chandan')
 function greeting(msg)
 {
   console.log('Hello',msg);
 }

 console.log("====================j")

greeting('Dinga')
var greeting = function(msg)
{
  console.log('Hi',msg);
}

console.log("====================j")

greeting('Dingi')
var greeting = (msg)=>{
  console.log('hi',msg);
}

console.log("====================j")

function factorial(num)
{
  var result = 1;
  for(var i =2; i<=num ; i++){
    result*=i;
  }
  return result;
}
console.log(factorial(5));


console.log("====================j")

function first(callFunc){
  setTimeout( function(){
    console.log('First function executed')
    callFunc();
  },0)

  // console.log('Executed')
}

function second(){
  console.log('Second Function Executed')
}
first()
second()

console.log("====================j")
const hobby =['aaa','bbb','cccc','ddd','eee']
const h = hobby.indexOf('cccc',3)

console.log(h)

