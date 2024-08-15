
fun main() {
    var idade01 = 30
    var idade02 = 50
    var altura01:Double = 1.80
    var altura02:Double = 1.50
    var nome: String = "Lincon"
    var estudante: Boolean = false

    var somaidade:Int = idade01 + idade02
    var somaaltura:Double = altura01 * altura02
    var saldacoes: String = "Olá $nome!"

    println("Idade: $idade01")
    println("Altura: $altura01")
    println("Nome: $nome")
    println("É estudante: $estudante")
    println("Soma das idade: $somaidade")
    println("Soma das alturas: $somaaltura")
    println(saldacoes)
}
