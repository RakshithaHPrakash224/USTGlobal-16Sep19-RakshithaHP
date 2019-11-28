const person={
name: "rakshitha",
age : 30,
address : {
    city : "Banglore",
    state : "Karnataka",
    country : "India"
}, 
hobbies : ['coding','Bird Watching' ,'Singing']
}

console.log('javascript person object',person)
const jsonObject = JSON.stringify(person)
console.log('JSON person object',jsonObject)
const javaObject = JSON.parse(jsonObject)
console.log('Java person object ',javaObject)

console.log("=================================")
localStorage.setItem('email','billgates@gmail.com');
let emailID = localStorage.getItem('email')
console.log(emailID)
//localStorage.clear()