package id.slava.nt.myfirstkmmapp.android.note_list

import id.slava.nt.myfirstkmmapp.domain.note.Note

data class NoteListState(
    val notes: List<Note> = emptyList(),
    val searchText: String = "",
    val isSearchActive: Boolean = false
)