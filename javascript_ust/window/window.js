console.log('window object',window)
console.log('this keyword',this)
console.log(this === window)


//window.alert('Welcome to javascript class')
//alert('Welcome to javascript class 2')

//let confirmDelete = confirm('Are you sure you want to delete')
//console.log('Confirm delete',confirmDelete)

let promptMethod = prompt('What is your name','Deeksha')
console.log('Username',promptMethod)

const person = {
    firstName : 'Alia',
    age : 26,
    lastName : 'Kapoor',
    getName : function(){
        console.log('This keyword',this)
        return this.firstName + '' +this.lastName
    }
}

let fullName = person.getName()
console.log('Full Name',fullName)