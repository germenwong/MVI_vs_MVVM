package com.hgm.mvi_vs_mvvm.mvi

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.hgm.mvi_vs_mvvm.domain.Post
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MviViewModel @Inject constructor(
      private val savedStateHandle: SavedStateHandle
) : ViewModel() {

      var state by mutableStateOf(MviState())
            private set

      init {
            savedStateHandle.get<String>("postId")?.let { postId ->
                  loadPost(postId)
            }
      }

      private fun loadPost(id: String) {
            viewModelScope.launch {
                  // do network call to load post .....
            }
      }

      private fun toggleLike(){
            state.postDetails?.let {
                  state=state.copy(
                        postDetails = it.copy(isLiked = !it.isLiked)
                  )
            }
      }

      fun onAction(action: MviAction) {
            when (action) {
                  MviAction.ToggleLike -> toggleLike()
                  else -> Unit
            }
      }
}