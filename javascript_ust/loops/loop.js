var brands = ['kingfisher','bisleri','aqua','kinley']
console.log('for of loop')
for(var element of brands){
console.log('Brand=' ,element);
}

console.log('===============');

console.log('For in loop')
for(var index in brands){
    console.log('brands=',index);
}

console.log('===============');

var person ={
    name: 'Sundar',
    age :33,
    color : 'white',

}
for(var key in person){
    console.log('value=',person[key])
} 
console.log('===============');

var movies=['Sholay','Mayabazar','jurasic park','Titanic'];
movies.forEach(function(mov, index){
    console.log('movies',mov);
    console.log('Movie index=',index);
});

console.log('===============');

var items=[
    {
        item : 'bangles',
        id: 1,
        price:100
    },

    {
        item : 'eyeliner',
        id : 2,
        pricen :500
    },

    {
        item : 'watch',
        id : 3,
        price : 5000
    },
    {
        item:'bike',
        id:4,
        price : 100000
    }
]

items.forEach(function(item,id,price){
    console.log('item=',item)
    console.log('id=',id )
    console.log('price=',price)
});


console.log("================================");


var name;
var name='Pailwan';
name = 'Prasthanam';
console.log(name);

console.log("================================");

let name1;
 //let name1 = 'Saaho'; no reasssigning;
name1 ='valmiki';
name1 = 'radha';
console.log(name1);

for(var i=0;i<5;i++){
    console.log('Inside the loop',i)
}
    console.log('Outside for loop',i);

console.log("================================");

for(let i=0;i<5;i++){
    console.log('Inside the loop',i)
}
    console.log('Outside for loop',i);

console.log("================================");

  const hobbies =['Sleeping','cricket', 'Eating','Coding','Roaming']
  console.log(typeof hobbies)

  const isArrayOrNot = Array.isArray(hobbies);
  console.log('Hobbies array or not',isArrayOrNot);
  
  console.log("================================");


  const hobbies1 = ['sleeping','cricket','eating','coding','Roaming'];
  hobbies1.splice(1,0,'Birdwatching','PUBG');
  console.log('after splicing',hobbies1);
  const slicekey = hobbies1.slice(1,3);
  console.log('after slice method',slicekey)

  const indexOfcoding = hobbies1.indexOf('Coding',1)
  console.log('index of coding',indexOfcoding)

  const stringHobbies = hobbies1.join('-')
  console.log('join operation',stringHobbies)


  const numbers =[100,200,300,400];
  const numbers1 =numbers.map(function(value,index){
      let newvalue =value+50;
      return newvalue;
  })

  console.log('After map method',numbers1)
  const num2 = numbers.map(value =>value+500)
  console.log('after the map arrow function',num2)


  console.log("================================");

  const filnumber = numbers.filter(function(value,index){
      if(value>200){
          return true
      }
      else{
          return false
      }
  })
  console.log('after filter number', filnumber)

  console.log("================================");

const filnumbers = numbers.filter(value => value>200 )
console.log('after filter number', filnumbers)

  
console.log("================================");


var items=[
    {
        item : 'bangles',
        id: 1,
        price:1000
    },

    {
        item : 'eyeliner',
        id : 2,
        pricen :5000
    },

    {
        item : 'watch',
        id : 3,
        price : 3000
    },
    {
        item:'bike',
        id:4,
        price : 170
    }
]


const updateItem = items.map(function(item,index){
item.price =item.price+300
return item
})

console.log(items)

console.log("=============================")

const itemsArrow = items.map((value) => {
    value.price = value.price + 300
    return value
})

console.log(itemsArrow)