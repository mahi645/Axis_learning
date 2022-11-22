package oops

fun main(){
    try{
        checkAgeEligibity(23)
    }
    catch(e:Exception){
        println(e.message)
    }

}
fun checkAgeEligibity(age:Int){
    if(age>=18){
        println("eligible for vote")
    }
    else{
        throw Exception("not eligible for vote")
    }
}
