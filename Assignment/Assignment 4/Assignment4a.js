console.log('By using array method');
const cources = ['javaScript','html','css','java','j2ee','angular']
console.log('cources=',cources);

const isArrayOrNot = Array.isArray(cources);
console.log('is array or not=',isArrayOrNot)

const hasHtml = cources.includes('html',1);
console.log('has a html=',hasHtml)

cources.push('C++','C#')
console.log('after puch method=',cources)

cources.pop();
console.log('after pop method=',cources)

cources.unshift('sql','testing');
console.log('after unshift method=',cources);

cources.shift()
console.log('after shift method=',cources)

cources.splice(1,2,'bostStack','Adv java')
console.log('after splice method',cources)

const afterSlice = cources.splice(2,4)
console.log('after AfterSlice method=',afterSlice)

cources.slice(2,4)
console.log('after slice method',cources)

const stringJoin = cources.join('-');
console.log('after join method=',stringJoin)

const indexOfCoding = cources.indexOf('css',2);
console.log('after indexOf method=',indexOfCoding)

console.log('-----------------------------------------------------------')
const colors = ['red','blue','green','black']
const isArrayOrNot1 = Array.isArray(colors);
console.log('is array or not=',isArrayOrNot1)

const hasGreen = colors.includes('green',2)
console.log('has green=',hasGreen)

colors.push('white','yellow')
console.log('after push=',colors)

colors.pop()
console.log('after pop=',colors)

colors.unshift('pink','golden')
console.log(colors)

colors.shift()
console.log('after shift=',colors)

colors.splice(1,2,'pinkRed','orange')
console.log('after splice=',colors)

colors.slice(2,3)
const afterSlice1 = colors.slice(2,4)
console.log('after slice=',colors)
console.log('after afterSlice=',afterSlice1)

const indexOfPink = colors.indexOf('pink',2)
console.log('after indexOf method=',indexOfPink)

const stringJoin1 = colors.join('-')
console.log('after join=',stringJoin1)

console.log('-----------------------------------------------------------------')
const company = ['ust globel','tcs','capgemini']
const isArrayOrNot2 = Array.isArray(company)
console.log('after isArray method=',isArrayOrNot)

const hasTcs = company.includes('tcs',1)
console.log('after includes method=',hasTcs)

company.push('Accenture','Infosys')
console.log('after push=',company)

company.pop()
console.log('after pop=',company)

company.unshift('wipro','fidelity')
console.log('after unshift=',company)

company.splice(1,2,'jasmin infotech','hcl')
console.log('after splice=',company)

company.slice(1,2)
const afterSlice2 =company.slice(1,2)
console.log('after slice=',company)
console.log('afterSlice method=',afterSlice2)

const indexOf2 = company.indexOf('ust globel',0)
console.log('after indexOf=',indexOf2)

const stringJoin2 = company.join('-')
console.log('after string join=',stringJoin2)
console.log('---------------------------------------------------')

const Hero = ['Ram Charan','Allu Arjun']
const isArrayOrNot3 = Array.isArray(Hero)
console.log('after isArray method=',isArrayOrNot3)
const hasInclude = Hero.includes('Ram charan',0)
console.log('after include method=',hasInclude)
Hero.push('SharukKhan','Salman Khan')
console.log('after push=',Hero)
Hero.pop()
console.log('after pop=',Hero)
Hero.unshift('Shahid Kapoor','Ranbir Kapoor')
console.log('after unshift=',Hero)
Hero.shift()
console.log('after shift=',Hero);
Hero.splice(2,3,'Surya','Arjit kumar')
console.log('after splice=',Hero)
Hero.slice(2,3)
const afterSlice4 = Hero.slice(2,3)
console.log('after slice=',Hero)
console.log('afterSlice method=',afterSlice4)
const indexOf4 =Hero.indexOf('Allu Arjun',1)
console.log('after infexOf',indexOf4)
const string4 = Hero.join('-')
console.log('After join=',string4)
console.log('-----------------------------------')

const subject = ['english','maths','science']
const isArrayOrNot5 = Array.isArray(subject)
console.log('after is array or not=',isArrayOrNot5)
const hasInclude1 = subject.includes('maths',1)
console.log('after includes=',hasInclude1)
subject.push('Biology','physics')
console.log('after push=',subject)
subject.pop()
console.log('after pop=',subject)
subject.unshift('m1','m2')
console.log('after unshift=',subject)
subject.shift()
console.log('after shift=',subject)
subject.splice(1,2,'m3','m4')
console.log('after splice',subject)
subject.slice(1,2)
const afterSlice5 =subject.slice(1,2)
console.log('after slice=',subject)
console.log('afterSlice=',afterSlice5)
const indexOf5 =subject.indexOf('m3',1)
console.log('after indexOf=',indexOf5)
const string5 =subject.join('-')
console.log('after join=',string5)
console.log('------------------------------------------------------')
const subjec = ['tiger','parrot','dog']
const isArrayOrNot6 = Array.isArray(subjec)
console.log('after is array or not=',isArrayOrNot6)
const hasInclud = subjec.includes('parrot',1)
console.log('after includes=',hasInclud)
subjec.push('cat','duck')
console.log('after push=',subjec)
subjec.pop()
console.log('after pop=',subjec)
subjec.unshift('kitten')
console.log('after unshift=',subjec)
subjec.shift()
console.log('after shift=',subjec)
subjec.splice(1,2,'camel','lion')
console.log('after splice',subjec)
subjec.slice(1,2)
const afterSlice6 =subjec.slice(1,2)
console.log('after slice=',subjec)
console.log('afterSlice=',afterSlice6)
const indexOf6 =subjec.indexOf('dog',1)
console.log('after indexOf=',indexOf6)
const string6 =subjec.join('-')
console.log('after join=',string6)
console.log('--------------------------------------------------------------')
const subj = ['orange','apple','mango']
const isArrayOrNot8 = Array.isArray(subj)
console.log('after is array or not=',isArrayOrNot8)
const hasInclude4 = subject.includes('apple',1)
console.log('after includes=',hasInclude4)
subj.push('grapes')
console.log('after push=',subj)
subj.pop()
console.log('after pop=',subj)
subj.unshift('pineapple')
console.log('after unshift=',subj)
subj.shift()
console.log('after shift=',subj)
subj.splice(1,1,'melon')
console.log('after splice',subj)
subj.slice(1,2)
const afterSlice8 =subj.slice(1,2)
console.log('after slice=',subj)
console.log('afterSlice=',afterSlice8)
const indexOf8 =subj.indexOf('grapes',1)
console.log('after indexOf=',indexOf8)
const string8 =subj.join('-')
console.log('after join=',string8)
console.log('---------------------------------------------------------')
const sub = ['melody','perk','munch']
const isArrayOrNot9 = Array.isArray(sub)
console.log('after is array or not=',isArrayOrNot9)
const hasInclude5 = subject.includes('munch',1)
console.log('after includes=',hasInclude5)
sub.push('milkeybar')
console.log('after push=',sub)
sub.pop()
console.log('after pop=',sub)
sub.unshift('dairy milk')
console.log('after unshift=',sub)
sub.shift()
console.log('after shift=',sub)
sub.splice(1,1,'snickers')
console.log('after splice',sub)
sub.slice(1,2)
const afterSlice9 =sub.slice(1,2)
console.log('after slice=',sub)
console.log('afterSlice=',afterSlice9)
const indexOf9 =sub.indexOf('snickers',1)
console.log('after indexOf=',indexOf9)
const string9 =sub.join('-')
console.log('after join=',string9)
console.log('---------------------------------------------------------')

const books = ['lovestory','comedy','fiction']
const isArrayOrNot5 = Array.isArray(books)
console.log('after is array or not=',isArrayOrNot5)
const hasInclude1 = books.includes('comedy',1)
console.log('after includes=',hasInclude1)
subject.push('Biology','physics')
console.log('after push=',subject)
subject.pop()
console.log('after pop=',subject)
subject.unshift('m1','m2')
console.log('after unshift=',subject)
subject.shift()
console.log('after shift=',subject)
subject.splice(1,2,'m3','m4')
console.log('after splice',subject)
subject.slice(1,2)
const afterSlice5 =subject.slice(1,2)
console.log('after slice=',subject)
console.log('afterSlice=',afterSlice5)
const indexOf5 =subject.indexOf('m3',1)
console.log('after indexOf=',indexOf5)
const string5 =subject.join('-')
console.log('after join=',string5)