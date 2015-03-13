for i in 1..100
	if i % 15 == 0
		puts i.to_s + " fizzbuzz"
	elsif i % 3 == 0
		puts i.to_s + " fizz"
	elsif i % 5 == 0
		puts i.to_s + " buzz"
	end
end