package com.hgm.mvi_vs_mvvm.domain

/**
 * @author: HGM
 * @created: 2024/6/27 0027
 * @description:
 **/
data class Comment(
      val id:String,
      val author:User,
      val content:String
)
