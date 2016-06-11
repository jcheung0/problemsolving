

def isPalindrome(value)
  puts value.length
  length = value.length/2
  isPalin = true;
  for i in 0..length
      if value[i] != value[value.length-i-1]
        return false
      end
  end
  return isPalin
end

value = gets.chomp

puts isPalindrome(value)
