package oops

fun main(){
    var employ:Employee=Employee(12,"anu",4000,15)
    println(employ.CalculatePerDay())
    println(employ.totalSalaryEarned())
}
class Employee(var id:Int,var name:String,var salary:Int,var noOfDays:Int){
    fun CalculatePerDay():Int{
        return (salary/30)
    }
    fun totalSalaryEarned():Int{
        return noOfDays*CalculatePerDay()
    }
}
