var palindrome=(number)=>{
    const str = number.toString();
    const reversedStr = str.split('').reverse().join('');
    return reversedStr==str
}
console.log(palindrome(156))