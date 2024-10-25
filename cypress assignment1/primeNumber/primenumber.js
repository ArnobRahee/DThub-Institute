var prime=function(number){
   var j=number/2;
    for (let i=2; i<=j; i++){
          if(number%i==0){
            return "Number not prime"
          }
    }
    return "Number is prime"
}
console.log(prime(11))
console.log(prime(27))