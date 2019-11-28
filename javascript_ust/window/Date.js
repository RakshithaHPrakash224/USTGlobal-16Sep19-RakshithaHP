var todayDate = new Date();
                
console.log('day',todayDate.getDay());
console.log('date',todayDate.getFullYear());
console.log('date',todayDate.getDate());


console.log("===========================")

var constMilli = new Date(0);
console.log('Date' ,constMilli);
var constString = new Date('Nov 10');
console.log('Date String Constructor' , constString);
var constYear = new Date(2017,10);
console.log('date year constructor' , constYear);


console.log("===========================")

console.log(Math.random());