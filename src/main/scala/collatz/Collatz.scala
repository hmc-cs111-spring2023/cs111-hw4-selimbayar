def collatz(n: Int): Int = 
  if (n % 2 == 0) then n / 2
  else (n * 3) + 1

def collatzCount(n: Int): Int = 
    if n == 1 then 0
    else 1 + collatzCount(collatz(n))
