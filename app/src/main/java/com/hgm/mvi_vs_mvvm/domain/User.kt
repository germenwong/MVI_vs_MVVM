package com.hgm.mvi_vs_mvvm.domain

/**
 * @author: HGM
 * @created: 2024/6/27 0027
 * @description:
 **/
data class User(
      val id: String,
      val role: Role,
      val email: String,
      val username: String
) {
      fun isAllowedToDeletePost(post: Post): Boolean {
            return when (role) {
                  Role.ADMIN -> true
                  Role.USER -> id == post.author.id
            }
      }
}

enum class Role {
      USER, ADMIN
}