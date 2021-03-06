package vn.htv.fresher.todoapp.domain.model

import org.threeten.bp.LocalDateTime

data class CategoryModel(
  val id         : Int,
  val name       : String,
  val icon       : String? = null,
  val createdAt  : LocalDateTime
)
