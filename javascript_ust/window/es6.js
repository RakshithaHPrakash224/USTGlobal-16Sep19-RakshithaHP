const message = new Promise(function(resolve,reject){
    if(30>0){
        resolve([{
            name : 'BillGates',
            age : 67
            },{
                name : 'Mark Zuckerberg',
                age : 40
            }, {
                name : 'birla',
                age : 45
            }])
            }
    else{
        reject('Failed')
    }
})
message.then(function(msg){
    console.log('Success Message' ,msg)
}).catch(function(error){
    console.log('failure message',error)
})


function outerFunction(counter){
    function innerFunction(){
        let count;
        count = counter + 10;
        return count
        }
        return innerFunction;
}

let innerFunc = outerFunction(10)
let counter = innerFunc()
console.log('Counter Value',counter)