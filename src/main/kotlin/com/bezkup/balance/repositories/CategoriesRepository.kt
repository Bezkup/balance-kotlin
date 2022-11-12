package com.bezkup.balance.repositories

import com.bezkup.balance.entity.Category
import org.springframework.data.repository.CrudRepository

interface CategoriesRepository : CrudRepository<Category,Long>{
    fun searchById(id: Long): Category?
    fun searchByCategoryName(name: String): Category?
    fun getAllCategories(): List<Category>?
}