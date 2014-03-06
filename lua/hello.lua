#!/usr/local/bin/lua
print("Hello, World")


sum = 0
num = 1
while num <= 100 do
    sum = sum + num
    num = num + 1
end
print("sum =",sum)


local age = io.read()
if age == 40 and sex =="Male" then
    print("男人四十一枝花")
elseif age > 60 and sex ~="Female" then
    print("old man without country!")
elseif age < 20 then
    io.write("too young, too naive!\n")
else
    print("Your age is "..age)
end