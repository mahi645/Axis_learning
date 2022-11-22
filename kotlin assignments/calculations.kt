import java.util.Scanner
fun main(args: Array<String>) {
    var scanner=Scanner(System.`in`)
    println("enter num1: ")
    var num3:Int=scanner.nextInt()
    println("enter num2: ")
    var num4:Int=scanner.nextInt()
    var cal=Calculation(num3,num4)
    print("1.Addition\t 2.Subtraction \t 3.Multiplication \t 4.Division ")
    var choice=scanner.nextInt()
    when(choice){
        1 -> println(cal.add())
        2 -> println(cal.sub())
        3 -> println(cal.multiply())
        4 -> println(cal.divide())
        else ->{
            println("enter 1 to 4 only")
        }
    }
    
    
    
    
}
class Calculation(var num1:Int=0,var num2:Int=0){
    
    fun add():Int{
        return num1+num2
    }
    fun sub():Int{
        return num1-num2
    }
    fun multiply():Int{
        return num1*num2
    }
    fun divide():Int{
        return num1/num2
    }

}