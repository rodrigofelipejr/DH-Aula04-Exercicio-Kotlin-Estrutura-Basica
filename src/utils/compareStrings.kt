package utils

fun compareStrings(str1: String, str2: String): Boolean {
    return str1 !== str2
}

fun compareStrings2(str1: String, str2: String): Boolean {
    return !str1.equals(str2)
}