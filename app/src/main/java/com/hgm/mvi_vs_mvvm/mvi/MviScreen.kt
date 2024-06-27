package com.hgm.mvi_vs_mvvm.mvi

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import com.hgm.mvi_vs_mvvm.domain.Post
import com.hgm.mvi_vs_mvvm.mvvm.MvvmScreen


@Composable
fun MviScreenRoot(
      navController: NavHostController,
      viewModel: MviViewModel = hiltViewModel()
) {
      MviScreen(
            state = viewModel.state,
            onAction = { action ->
                  when (action) {
                        MviAction.GoBack -> navController.navigateUp()
                        else -> Unit
                  }
                  viewModel.onAction(action)
            }
      )
}


@Composable
fun MviScreen(
      state: MviState,
      onAction: (MviAction) -> Unit
) {
      if (state.isLoading) {
            Box(
                  modifier = Modifier.fillMaxSize(),
                  contentAlignment = Alignment.Center
            ) {
                  CircularProgressIndicator()
            }
      } else {
            // Display post details ...
      }
}