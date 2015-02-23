

function squareDigits(num){
    var number = num.toString();
    var stringResult = '';

    for( i in number){
        value = parseInt(number[i]);
        value = value*value;
        stringResult = stringResult + value;
    }
    console.log(stringResult);
    return parseInt(stringResult);
}


console.log(squareDigits(9119));
