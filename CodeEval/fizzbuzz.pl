#!/usr/bin/perl
use feature qw(say);
$var = "hello world";

for ($i = 0;$i < 15; $i++){
    #print $i;
    fizzbuzz($i);
}

sub fizzbuzz{

    my $num = @_;
    print $num; 
    if($num){
        return $num;
    }
    
    if($num % 15 == 0){
        return "FizzBuzz";
    }

    if($num % 5 == 0){
        return "Buzz";
    }

    if($num % 3 == 0){
        return "Fizz";
    }
}
