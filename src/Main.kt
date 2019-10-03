/*fun verifyOperation(operat: MutableListIterator<Char>, nums: List<String>): Int{
    var result: Int = 0
    if(operat[0] == '+'){
        for(i in nums){
            result += i.toInt()
        }
    }
    return result
}*/
import Evaluer

fun main() {
    val evaluer = Evaluer()

    var originalNome: String = readLine()!!
    var nome: String = originalNome.replace("\\s".toRegex(), "")
    var operacoes = arrayOf('+','-','*','/')
    var opers = mutableListOf<Char>()
    var allOpers = mutableListOf<Char>()
    var allNew = mutableListOf<Char>()
    var newest = nome.split("+","-","*","/").toMutableList()


    /*for(i in 0..nome.length -1){
        println(nome.split(operacoes[i]))
    }
    println(nome[1])*/

   /* operacoes.forEach{
        var indx: Int = nome.indexOf(it)
        if(!(indx == -1)){
            println(nome.substringBefore(it))
        }
    }*/

    operacoes.forEach {
        if (nome.contains(it)) {
            opers.add(it)
        }
    }
    for(i in 0..nome.length-1) {
        allNew.add(nome[i])
    }

    allNew.forEach{
        if(opers.contains(it)){
            allOpers.add(it)
        }
    }


        /*println(newest[allOpers.indexOf('*')])
        println(newest[allOpers.indexOf('*')] + 1)*/


    var nMult: Int = 0
    var nMult2: Int = 0
    var result = 0
    var sz = allOpers.size -1
    var allArraySize = 0
    for(i in 0..sz){
        if(allOpers[i] == '*' || allOpers[i] == '/'){
            if(allOpers[i] == '*') {
                nMult = newest[allOpers.indexOf(allOpers[i])].toInt()
                nMult2 = newest[allOpers.indexOf(allOpers[i]) + 1].toInt()
                result = nMult * nMult2
                println(result)
              /*  newest[allOpers.indexOf(allOpers[i])] = result.toString()
                newest.removeAt(allOpers.indexOf(allOpers[i]) + 1)
                allArraySize = newest.size*/

                //allOpers.removeAt(allOpers.indexOf(allOpers[i]))
            }
            if(allOpers[i] == '/') {
                nMult = newest[allOpers.indexOf(allOpers[i])].toInt()
                nMult2 = newest[allOpers.indexOf(allOpers[i]) + 1].toInt()
                result = nMult / nMult2
              /*  newest[allOpers.indexOf(allOpers[i])] = result.toString()
                newest.removeAt(allOpers.indexOf(allOpers[i]) + 1)
                //allOpers.removeAt(allOpers.indexOf(allOpers[i]))*/
            }


        }
    }
    println(result)
    println(newest)
    /*println(opers)
    println(allOpers)*/



}