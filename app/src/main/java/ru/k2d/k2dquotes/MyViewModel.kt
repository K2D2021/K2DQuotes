package ru.k2d.k2dquotes

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import ru.k2d.k2dquotes.domain.repository.MyRepository
import javax.inject.Inject

@HiltViewModel
class MyViewModel @Inject constructor(
    private val repository: dagger.Lazy<MyRepository>
) : ViewModel() {

    init {
        repository.get()
    }

}