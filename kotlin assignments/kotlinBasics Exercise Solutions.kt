//1.Swapping of two numbers using temporary variable
fun main(args: Array<String>) {
    var num1:Int=12
    var num2:Int=53
    var temp:Int
    println("Before swapping:  number1 = $num1 \t  number2 = $num2")
    temp=num1
    num1=num2
    num2=temp
    println("After swappimg: number1 = $num1 \t  number2 = $num2")
    
    
    
    //b.Swapping of two numbers without using temporary variable
    
    var num3:Int=23
    var num4:Int=67
    println("Before swapping:  number3 = $num3 \t  number4 = $num4")
    num3=num3+num4
    num4=num3-num4
    num3=num3-num4
    println("After swappimg: number3 = $num3 \t  number4 = $num4")
    
//2.check year is leap or not
    
    
    var num5:Int=2016
    var year:String=if((num5%400==0)  || ((num5%4==0) && (num5%100!=0))) "$num5 leap year" else "$num5 not a leap year"
    println(year)
     

//3.factorial of a number
    
    var num6:Int=5
    var factorial:Int=1
    for(i:Int in 5 downTo 1){
        factorial=factorial*i
    }
    println("factorial of $num6: $factorial") 
    
    
    
//4.Fabinocci sereies
    
    var num7:Int=6;
    var num8:Int=0
    var num9:Int=1
    print("$num8 $num9 ")
    for(i:Int in 1..num7-2){
        var temp:Int=num8+num9
        num8=num9
        num9=temp
        print("$num9 ")
    }
    
//5.Reverse a number
    

    var num10:Int=1234
    var remainder:Int
    var reverse_num:Int=0
    var temp1:Int=1
    while(num10!=0){
        remainder=num10%10
        reverse_num= (reverse_num*10)+remainder
        num10=num10/10
        
    }
    println("number:$num10 Reversed number:$reverse_num")
    
//7.Check given num is Palidrome or not
    var result:String= if(num10==reverse_num) "given num is palindrome" else "Given num is not a palindrome"
    println(result)
    
    
//6) using for loop to print even number between 1 to 20
   
    for (i:Int in 1..20){
        if(i%2==0){
            println(i)
        }
    }


//8.print the right traingle pattern

    var rows:Int=5
    var columns:Int=5
    for(i:Int in 1..rows){
        for (j:Int in 1..i){
            print("*")
        } 
        println()
    }


//9)check whether the number is Armstrong number or not	

    var num12:Int=153
    var str_length:Int=(num12.toString()).length
    var num_toDouble=num12.toDouble()
    println(str_length)
    
    var remainder:Int
    var result_num:Double=0.0
    while(num12!=0){
        remainder=num12%10
        var temp=Math.pow(remainder.toDouble(),str_length.toDouble())
        result_num=result_num+temp
        num12=num12/10
    
    }
    var output:String=if(num_toDouble == result_num) "Given num is armstrong" else "Given num is not Armstrong"
    println(output)
//10.print pattern 

    val rows: Int = 5
    val columns: Int = 5
    for(i:Int in 1..rows){
        
        for(j:Int in i downTo 1)
        {
           
            print(j)
        }
        println()
    }
}