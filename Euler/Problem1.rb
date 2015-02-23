

def sum(n)
	sum  = 0
	for i in 1..1000
		if (i % 3 == 0 or i % 5 == 0)
			sum = sum + i
		end
	end

	puts sum
end

sum(10)
