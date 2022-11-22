fun main(args: Array<String>) {
    //1.sorting array in ascending order
    
    
    var array1=arrayOf<Int>(1,6,3,8,2)
    
    for (i:Int in 0..array1.size-1){
        for (j:Int in i+1..array1.size-1){
            var temp:Int=0
            if(array1[i]>array1[j]){
                temp=array1[i]
                array1[i]=array1[j]
                array1[j]=temp
            }
        }
        
    }
    for (j:Int in 0..array1.size-1)
    {
        println(array1[j])
    }
    
    //5.second large num in array
    println(array1[1])
    
    //2.sorting array in descending order
    
    
    var array2=arrayOf<Int>(1,6,3,8,2)
    
    for (i:Int in 0..array2.size-1){
        for (j:Int in i+1..array2.size-1){
            var temp:Int=0
            if(array2[i]<array2[j]){
                temp=array2[i]
                array2[i]=array2[j]
                array2[j]=temp
            }
        }
        
    }
    for (j:Int in 0..array2.size-1)
    {
        println(array2[j])
    }
    
    
    //3.larger num in array
    
    
    var array3=arrayOf<Int>(1,5,2,8)
    var larger:Int=array3[0]
    for(i:Int in 0..array3.size-1){
        if(larger>=array3[i]){
            larger=larger
        }
        else{
            larger=array3[i]
        }
    }
    println(larger)
    
    
    //4.smaller num in array
    
    var array4=arrayOf<Int>(1,5,2,8)
    var smaller:Int=array4[0]
    for(i:Int in 0..array4.size-1){
        if(smaller<=array4[i]){
            smaller=smaller
        }
        else{
            smaller=array4[i]
        }
    }
    println(smaller)
    
    
    //6.sum of elements in array
     var array6=arrayOf<Int>(1,6,2,9)
     var sum:Int=0
     for (i:Int in 0..array6.size-1){
        sum=sum+array6[i]
     
     }
     println(sum)
}