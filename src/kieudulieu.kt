package hello
fun main (args : Array<String>) {
    println("hello world")
    val x = 3.144444
   // x = 3.5555
    println("x = $x")
    val createNumberLong = 3333_3235_7556_3345L
    println("createNumberLong = $createNumberLong")

    val aNull : Int?
    aNull  = 20
    println("aNull $aNull")

    val aInt : Int? = 123
    val aLong : Long? = aInt?.toLong()
    println("aLong = $aLong")

    val aCovertaFloat : Float = "123.45".toFloat()
    println("aCovertaFloat = $aCovertaFloat")

    var a : Double = 0.0
    var b : Double = -0.0
    if (a == b ){
        println(" a is equal to b")
    }

    var z : Double = 2.2
    var a1 : Double = z
    var b1 : Double = z

    if (a1 === b1) {
        println("a is identical to b")
    }

    var aTrueValue1 = (100 > 99) && (2<5)
    var aTrueValue2 = (100 > 99) || (2<5)
    println("aTrueValue1 = $aTrueValue1")
    println("aTrueValue2 = $aTrueValue2")

    var c = 9
    c +=1
    println("c = $c")

}