package com.hgm.mvi_vs_mvvm.mvi

import com.hgm.mvi_vs_mvvm.domain.Post

/**
 * @author: HGM
 * @created: 2024/6/27 0027
 * @description:
 **/
data class MviState(
      val postDetails: Post? = null,
      val isLoading: Boolean = false,
      val isPostLiked: Boolean = false,
)
