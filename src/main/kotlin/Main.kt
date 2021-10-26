fun main(args: Array<String>) {

    //  Crie variáveis que armazenem o nome do usuário, idade, preferência de emprego, nacionalidade e
    //  tipo sanguíneo

    /*
    var nome
    var idade
    var tipoSanguineo
    var emprego
    var nacionalidade
    */

    print("Informe o seu nome: ")
    var nome = readLine()!!
    print("Informe a sua idade: ")
    var idade = readLine()!!.toInt()
    print("Informe o se tipo sanguineo: ")
    var tipoSanguineo = readLine()!!
    print("Informe a sua nacionalidade: ")
    var nacionalidade = readLine()!!
    print("Informe a sua preferencia de emprego: ")
    var emprego = readLine()!!
    var ano = 2021
    var anoNasc = idade - ano

    println("\nOlá, $nome, a sua idade é: $idade, nascido no ano de: $anoNasc, seu tipo sanguineo é: $tipoSanguineo" +
            ", \na sua nacionalidade: $nacionalidade e a sua preferencia por emprego é: $emprego.")
}
