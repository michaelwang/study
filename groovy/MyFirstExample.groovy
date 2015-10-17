println "hello world"
def message = 12
println message.class

def repeat(val,repeat=5){
  for (i = 0; i < repeat; i++){
    println val
  }
}

repeat("Hello",2)

def range = 0..4
println range.class
assert range instanceof List

def coll = ["Groovy","Java","Ruby"]
assert coll instanceof Collection
assert coll instanceof ArrayList

coll << "Smalltalk"
coll[5] = "Perl"

assert coll[1] == "Java"

def numbers = [1,2,3,4,5,6]
assert numbers.join(",") == "1,2,3,4,5,6"
assert [1,2,3,4,5].count(3) == 1

def hash = [name:"Andy","VPN-#":45]
assert hash.getClass () == java.util.LinkedHashMap
hash.put("id",23)
assert hash.get("name") == "Andy"

hash.dob = "01/29/76"
assert hash.dob == "01/29/76"

def acoll = ["Groovy","Java","Ruby"]

acoll.each{
  println it
}

hash.each{
  key,value ->
    println "${key} : ${value}"
}

"ITERATION".each{
  println it.toLowerCase()
}

def excite = {
  word ->
    return "${word}!!"
}

assert "Groovy!!" == excite("Groovy")

def sng = new Song(name:"Kung Fu Fighting",genre:"Disco")
println sng

println sng.artist?.toUpperCase()