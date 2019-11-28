var cars=['benz','audi','rr','lr']
for(var i=0;i<cars.length;i++)
{
    
    console.log(cars[i]);
}
console.log("============================")
for(var elem of cars){
    console.log(elem);
}
console.log('==================');
for( var index in cars)
{
    console.log(cars[index]);
    
}
var car=[{
    name:'volvo',
    model:'xc90',
    color:'white',
}
]

for( var key in car){
console.log('value=',car[key])
}

car.forEach(function(value,index) {
    console.log(value);
});

var malls=['orion','forum','phoneix',,'galleria']
for(var i=0;i<malls.length;i++)
{
    console.log(malls[i]);
}
for(var elments of malls)
{
    console.log(elments)
}
for (var key in malls) {
    console.log(malls[key])
}
malls.forEach(function(val,index)
{
    console.log(val)
})
var mobiles=['oneplus','oppo','vivo','iphone']
for(var i=0;i<mobiles.length;i++)
{
    console.log(mobiles[i])
}
for(var ele of mobiles)
{
    console.log(ele)
}
for(var indx in mobiles)
{
    console.log(mobiles[indx])
}

var mobiles=[{
    brand:'oneplus',
    model:7,
    price:40000
},
{
    brand:'iphone',
    model:6,
    price:20000
},
{
    brand:'vivo',
    model:'v6',
    price:20000
},
{
    brand:'oppo',
    id:9,
    price:30000
},
]
mobiles.forEach(function(brand,mob)
{
    console.log(brand)
})
var bikes=['re','bajaj','yamaha','ktm']
for(var i=0;i<bikes.length;i++)
{
    console.log(bikes[i])
}
for(var ele of bikes)
{
    console.log(ele)
}
for(var indx in bikes)
{
    console.log(bikes[indx])
}

var bik=[{
    brand:'yamaha',
    model:7,
    price:40000
},
{
    brand:'ktm',
    model:6,
    price:20000
},
{
    brand:'bajaj',
    model:'v6',
    price:20000
},
{
    brand:'re',
    id:9,
    price:30000
},
]
mobiles.forEach(function(brand,bik)
{
    console.log(brand)
})