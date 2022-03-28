package com.gaeng517.gaengcleanarchi.feature_note.domain.presentation

data class NoteTextFieldState(
    val text: String = "",
    val hint: String = "",
    val isHintVisible: Boolean = true
)