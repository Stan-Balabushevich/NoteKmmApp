package id.slava.nt.myfirstkmmapp

import database.NoteEntity
import id.slava.nt.myfirstkmmapp.database.NoteDatabase


class Greeting {

    private val platform: Platform = getPlatform()

    fun greet(): String {
        return "Hello, ${platform.name}!"
    }
}