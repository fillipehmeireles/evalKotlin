fun main() {
    var aux: Int = 0
    var numeros: String = "3+4+5"
    var newest = numeros.split("+","-","*","/").toMutableList()
    println(newest)
    for (i in 0..numeros.length - 1) {
        /*  if(numeros[i] == '*'){
            println(numeros[i - 1].toInt() * numeros[i + 1].toInt())
        }
        if(numeros[i] == '-'){
            println(numeros[i - 1].toInt() - numeros[i + 1].toInt())
        }
        if(numeros[i] == '/'){
            println(numeros[i - 1].toInt() / numeros[i + 1].toInt())
        }
        if(numeros[i] == '+'){
            println(numeros[i - 1].toInt() + numeros[i + 1].toInt())
        }*/

        if (numeros[i] == '+') {
            /*println("Atual ${i} --- ${numeros[i]}")
            println("Anterior ${i - 1} --- ${numeros[i - 1]}")
            println("Posterior ${i + 1} --- ${numeros[i + 1]}")}*/
            //aux += numeros[i - 1].toInt() - '0'.toInt() + numeros[i + 1].toInt() - '0'.toInt()
            aux += newest[1].toInt()
            println(aux)
        }
    }
}