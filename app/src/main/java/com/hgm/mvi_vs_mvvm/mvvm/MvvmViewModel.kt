package com.hgm.mvi_vs_mvvm.mvvm

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
class MvvmViewModel @Inject constructor(
      private val savedStateHandle: SavedStateHandle
) : ViewModel() {

      var postDetails by mutableStateOf<Post?>(null)
            private set

      var isLoading by mutableStateOf(false)
            private set

      var isPostLiked by mutableStateOf(false)
            private set


      init {
            savedStateHandle.get<String>("postId")?.let { postId->
                  loadPost(postId)
            }
      }

      private fun loadPost(id: String) {
            viewModelScope.launch {
                  // do network call to load post .....
            }
      }

      fun toggleLike(){
            postDetails?.let {
                  postDetails=it.copy(isLiked = !it.isLiked)
            }
      }
}