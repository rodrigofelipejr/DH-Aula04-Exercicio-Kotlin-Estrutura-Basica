package utils

fun maxNumber(num1: Int, num2: Int, num3: Int): Int? {
    val list = arrayListOf<Int>()
    list.add(num1)
    list.add(num2)
    list.add(num3)
    return list.max()
}

fun maxNumber2(vararg nuns: Int): Int? {
    val list = arrayListOf<Int>()
    for (n in nuns) {
        list.add(n)
    }
    return list.max()
}

fun maxNumber3(num1: Int, num2: Int, num3: Int): Int? {
    return maxOf(num1, num2, num3)
}
