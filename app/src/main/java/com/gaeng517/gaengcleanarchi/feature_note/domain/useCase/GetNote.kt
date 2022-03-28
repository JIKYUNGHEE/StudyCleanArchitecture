package com.gaeng517.gaengcleanarchi.feature_note.domain.useCase

import com.gaeng517.gaengcleanarchi.feature_note.domain.model.Note
import com.gaeng517.gaengcleanarchi.feature_note.domain.repository.NoteRepository

class GetNote(private val repository: NoteRepository) {
    suspend operator fun invoke(id: Int): Note? {
        return repository.getNoteById(id)
    }
}