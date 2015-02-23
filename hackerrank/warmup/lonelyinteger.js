function processData(input) {
    var numbers = input.split("\n");
    var nums = numbers[1].split(" ");
    var count = {};
    for(i in nums){
        if(count[nums[i]]){
            count[nums[i]] = count[nums[i]] + 1;
        }else{
            count[nums[i]] = 1;
        }
    }
    for(c in count){
       
        if(count[c] == 1){
            console.log(c);
        }        
    }
} 

process.stdin.resume();
process.stdin.setEncoding("ascii");
_input = "";
process.stdin.on("data", function (input) {
    
    _input += input;
});

process.stdin.on("end", function () {
   processData(_input);
});