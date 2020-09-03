package utils

fun analyzesFourNumbers(numA: Int, numB: Int, numC: Int, numD: Int): Boolean {
    return numA > numC && numA > numD || numB > numC && numB > numD
}