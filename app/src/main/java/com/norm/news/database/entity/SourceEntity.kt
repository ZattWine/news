package com.norm.news.database.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.norm.news.domain.NewsSource

/**
 * Created by KZYT on 16/01/2020.
 */
@Entity(tableName = "news_source_table")
data class SourceEntity(
  @PrimaryKey
  val id: String,

  @ColumnInfo(name = "name")
  val name: String,

  @ColumnInfo(name = "description")
  val description: String,

  @ColumnInfo(name = "url")
  val url: String,

  @ColumnInfo(name = "category")
  val category: String,

  @ColumnInfo(name = "language")
  val language: String,

  @ColumnInfo(name = "country")
  val country: String
)

/**
 * Extension function for Map<Entity, Domain>
 */
fun List<SourceEntity>.asDomainModel(): List<NewsSource> {
  return map {
    NewsSource(
        id = it.id,
        name = it.name,
        description = it.description,
        url = it.url,
        category = it.category,
        language = it.language,
        country = it.country
    )
  }
}