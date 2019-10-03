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

    println(evaluer.eval(allOpers,newest))
}