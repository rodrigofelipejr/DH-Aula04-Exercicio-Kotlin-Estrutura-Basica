package utils

fun firstHundredOdd(): Unit {
    var idx = 1
    var nuns = 0

    do {
        if (!isPair(idx)) {
            print("$idx ")
            nuns++
        }

        idx++
    } while (nuns !== 100)
}

fun firstHundredOdd2(): Unit {
    for (num in 1..200 step 2) {
        print("$num ")
    }
}