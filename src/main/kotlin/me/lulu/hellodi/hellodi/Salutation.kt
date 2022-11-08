package me.lulu.hellodi.hellodi

class Salutation(private val messageWriter: MessageWriter) {
    fun exclaim() {
        messageWriter.write("Hello, DI!")
    }
}