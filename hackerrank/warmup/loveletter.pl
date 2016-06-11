


sub isPalindrome{
    my ($value) = @_;
    for($i = 0; $i < length($value); $i++){
        if ()substr($value,$i,1)  != substr($value, length($value)-$i-1,1);
    }
}

isPalindrome("test");

