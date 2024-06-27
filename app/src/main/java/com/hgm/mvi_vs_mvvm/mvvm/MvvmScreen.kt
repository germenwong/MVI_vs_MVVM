package com.hgm.mvi_vs_mvvm.mvvm

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import com.hgm.mvi_vs_mvvm.domain.Post


@Composable
fun MvvmScreenRoot(
      navController: NavHostController,
      viewModel: MvvmViewModel = hiltViewModel()
) {
      MvvmScreen(
            postDetails = viewModel.postDetails,
            isLoading = viewModel.isLoading,
            isPostLiked = viewModel.isPostLiked,
            onToggleLike = viewModel::toggleLike,
            onGoBack = navController::navigateUp
      )
}


@Composable
fun MvvmScreen(
      postDetails: Post?,
      isLoading: Boolean,
      isPostLiked: Boolean,
      onToggleLike: () -> Unit,
      onGoBack: () -> Unit
) {
      if (isLoading){
            Box(
                modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.Center
            ) {
                CircularProgressIndicator()
            }
      }else{
            // Display post details ...
      }
}