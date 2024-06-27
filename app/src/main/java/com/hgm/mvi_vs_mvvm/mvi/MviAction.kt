package com.hgm.mvi_vs_mvvm.mvi


sealed interface MviAction {
      data object ToggleLike : MviAction
      data object GoBack : MviAction
}