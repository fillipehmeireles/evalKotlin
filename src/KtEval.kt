import Evaluer

fun main() {
    val evaluer = Evaluer()

    var originalNumber: String = readLine()!!
    var number: String = originalNumber.replace("\\s".toRegex(), "")
    var mathOperations = arrayOf('+','-','*','/')
    var operationsTimes = mutableListOf<Char>()
    var allOpers = mutableListOf<Char>()
    var newNumber = mutableListOf<Char>()
    var finalNumber = number.split("+","-","*","/").toMutableList()
    var containsVerify: Boolean = false

    number.forEach {
        if(mathOperations.contains(it)){
            containsVerify = true
        }
    }
    if(containsVerify) {
        mathOperations.forEach {
            if (number.contains(it)) {
                operationsTimes.add(it)
            }
        }
        for (i in 0..number.length - 1) {
            newNumber.add(number[i])
        }

        newNumber.forEach {
            if (operationsTimes.contains(it)) {
                allOpers.add(it)
            }
        }

        println(evaluer.eval(allOpers, finalNumber))
    }
    else{
        println("No operation found...")
    }
}