const obj={a:"Red",b:"blue",a:"gray"}
console.log(obj);

if(!{}){
    console.log("object");
}
let a=[]
let b=[]
let c=a
console.log(a==b); //false because memory address id different
console.log(a===b);
console.log(a==c); //true because memory address is same
console.log(a===c);

const n= ()=>{
'use strict';
"sfd;smdf"
console.log("hello");
}
n()

// for(let i=0;i<3;i++){
// setTimeout(()=>console.log(i),1)
// }
// for(let i=0;i<3;i++){
//     setTimeout(()=>console.log(i),1)
//     }

    function add(a,b){
        console.log(a+b);
    }
    add("1",5)

    let ns=0;
console.log(ns++);
console.log(++ns);
console.log(ns);

let check={gree:"hey"}
let d=check

check.gree="India"
console.log(d.gree);
