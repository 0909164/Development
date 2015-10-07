password = raw_input("Type a password")
uppercase = 0
numbers = 0
lowercase = 0
space = 0
symbols_char = 0
symbols = "!@#$%^&*()[];:'?<>.,"
for p in password:
   print(p)
   if p.istitle():
       uppercase += 1
   if p.isdigit():
       numbers += 1
   if p.islower():
       lowercase += 1
   if p.isspace():
       space += 1
   for sc in symbols:
       if p == sc:
           symbols_char += 1
if uppercase < 1:
   print("Need at least 1 capital in your password")
if numbers < 2:
   print("Need at least 2 numbers in your password")
if lowercase < 5:
   print("Need at least 6 lowercase in your password")
if space == 0:
   print("You don't have spaces in your password")
if symbols_char == 0:
   print("You haven't used any symbols!")
