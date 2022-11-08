package me.lulu.hellodi.hellodi

import org.junit.jupiter.api.Assertions.*
import kotlin.test.Test

internal class SalutationTest{

    @Test
    fun shouldCallMessageWriter(){
        val messageWriter = object : MessageWriter {
            var called = false
            override fun write(message: String) {
                called = true
            }
        }
        val salutation = Salutation(messageWriter)
        salutation.exclaim()
        assertTrue(messageWriter.called)
    }
}