function factorial(numbers){
    if (numbers==1 || numbers==0){
        return 1;
    }
    else{
        return numbers *factorial(numbers-1)
    }

}
console.log(factorial(5));