function fibonacci(number){
    var j=0;
    var k=1;
    let l=0;
    var s="";
    for(let i=1; i<=number; i++){
        s+=l+", ";
        l=j+k;
        j=k;
        k=l;
    }
    return s;
}
console.log(fibonacci(11));