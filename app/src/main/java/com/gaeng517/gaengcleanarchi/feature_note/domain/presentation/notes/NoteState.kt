package com.gaeng517.gaengcleanarchi.feature_note.domain.presentation.notes

import com.gaeng517.gaengcleanarchi.feature_note.domain.model.Note

data class NoteState (
    val notes: List<Note> = emptyList()
)