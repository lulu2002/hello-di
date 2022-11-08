package me.lulu.hellodi.hellodi

fun main() {
    val writer: MessageWriter = SecureMessageWriter(ConsoleMessageWriter(), Identity.USER)
    val salutation = Salutation(writer)

    salutation.exclaim()
}