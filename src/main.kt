fun main(){
var x = times(arrayOf(7,5,3,8))
    println(x)
   var y= mixedType(arrayOf("misky
   
   ",true,20.4,0.5F,'d'))
   println(y)
    var z = returnVowel(arrayOf('d','f','e','y','u','i'))
    println(z)

}
fun times(num:Array<Int>):Int{
    var digit = 1
    num.forEach { number->
        digit*=number

    }
return digit
}
fun mixedType(figure:Array<Any>):Double{
var total = 0.0
  figure.forEach{mixer->
     if(mixer is  Double || mixer is Float){
       total+=mixer.toString().toDouble()      }

}
    return total
}
fun returnVowel(vowels:Array<Char>):Int{
    var alpha =0
    vowels.forEach { characters->
        if(characters=='a'|| characters=='e'||characters=='i'||characters=='o'||characters=='u' ){
            alpha++
        }

    }
    return alpha
}