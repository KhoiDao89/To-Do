package vn.htv.fresher.todoapp.data.db.dao

import androidx.room.*
import io.reactivex.Completable
import io.reactivex.Single
import vn.htv.fresher.todoapp.data.db.entity.Category

@Dao
interface CategoryDao {

  @Delete
  fun delete(entity: Category): Completable

  @Insert
  fun insert(entity: Category): Completable

  @Query("SELECT * FROM ${Category.NAME}")
  fun getAll(): Single<List<Category>>

  @Update
  fun update(entity: Category): Completable

}