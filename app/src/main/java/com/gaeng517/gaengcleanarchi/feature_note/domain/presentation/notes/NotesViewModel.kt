package com.gaeng517.gaengcleanarchi.feature_note.domain.presentation.notes

import androidx.lifecycle.ViewModel
import com.gaeng517.gaengcleanarchi.feature_note.domain.useCase.AddNote
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class NotesViewModel @Inject constructor(
    private val addNote: AddNote
): ViewModel() {

}
