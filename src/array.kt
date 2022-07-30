fun main() {


    val array = arrayOf(1,2)
    val arrayOdd = arrayOf(10, 20)
    var res = 0

    for (arr in array.indices) {
        print(" " + array[arr])
        res += array[arr]
    }
    print("  ////// ")
    for (ar in arrayOdd.indices) {
        print(" " + arrayOdd[ar])
        res +=arrayOdd[ar]
    }
    println()
    println(res)

}

