class Evaluer {
    var result: Int = 0
    var arrSize: Int = 0

    fun eval(operations: MutableList<Char>, numbers: MutableList<String>): Int{
        this.arrSize = operations.size - 1
        for(i in 0.. this.arrSize){
            if(operations[i] == '+'){
                this.result = numbers[operations.indexOf(operations[i])].toInt() + numbers[operations.indexOf(operations[i]) + 1 ].toInt()
            }
            if(operations[i] == '-'){
                this.result = numbers[operations.indexOf(operations[i])].toInt() - numbers[operations.indexOf(operations[i]) + 1 ].toInt()
            }
            if(operations[i] == '*'){
                this.result = numbers[operations.indexOf(operations[i])].toInt() * numbers[operations.indexOf(operations[i]) + 1 ].toInt()
            }
            if(operations[i] == '/'){
                this.result = numbers[operations.indexOf(operations[i])].toInt() / numbers[operations.indexOf(operations[i]) + 1 ].toInt()
            }
        }
        return this.result
    }

}