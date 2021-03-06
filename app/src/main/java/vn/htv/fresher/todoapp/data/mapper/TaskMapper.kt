package vn.htv.fresher.todoapp.data.mapper

import vn.htv.fresher.todoapp.data.db.entity.Task
import vn.htv.fresher.todoapp.domain.model.TaskModel

/**
 * Convert Task entity to Task model
 */
fun Task.toModel() = TaskModel(
  id         = id,
  catId      = catId,
  name       = name,
  finished   = finished,
  deadline   = deadline,
  myDay      = myDay,
  important  = important,
  reminder   = reminder,
  repeat     = repeat,
  createdAt  = createdAt,
  note       = note
)