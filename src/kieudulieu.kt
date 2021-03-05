package hello
fun main (args : Array<String>) {
    // lession 2
  //  Characters or char
    var a : Char = 'c'
    a = '\u0040'
    println("a = $a")
    var myName = "Thong"
    for (eachChar in myName){
        println("myName = $eachChar")
    }

    val strings : Array<String> = arrayOf("a","b","c","d")
    for (strings in strings) {
        println("strings = $strings")
    }

    val intNumbers : Array<Int> = Array<Int>(5, {i -> 2 * i})
    for (intNumber in intNumbers){
        println("intBumber = $intNumber")
    }

    val  text = """
       |line 1
       |line 2
              """.trimMargin("|")
   println(text)







    /* lession1
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
    */






}