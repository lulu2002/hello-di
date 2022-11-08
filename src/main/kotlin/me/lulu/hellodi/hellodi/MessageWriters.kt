package me.lulu.hellodi.hellodi

interface MessageWriter {

    fun write(message: String)

}

class ConsoleMessageWriter : MessageWriter {
    override fun write(message: String) {
        println(message)
    }
}

class SecureMessageWriter(
    private val messageWriter: MessageWriter,
    private val identity: Identity
) : MessageWriter {
    override fun write(message: String) {
        if (identity.isAdmin)
            messageWriter.write(message)
    }
}