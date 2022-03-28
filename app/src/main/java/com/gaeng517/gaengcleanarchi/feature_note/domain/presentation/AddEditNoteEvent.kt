package com.gaeng517.gaengcleanarchi.feature_note.domain.presentation

sealed class AddEditNoteEvent {
    data class EnteredTitle(val value: String): AddEditNoteEvent()
    object SaveNote: AddEditNoteEvent()
}