package com.bezkup.balance.services

import com.bezkup.balance.entity.Category
import com.bezkup.balance.repositories.CategoriesRepository
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service

@Service
class CategoryService(private val repository: CategoriesRepository) {
    fun getAllTransaction(): List<Category>? {
        return repository.findAll()
    }
    fun searchById(id: Long): Category? {
        return repository.findByIdOrNull(id)
    }
    fun save(transaction: Category): Category {
        return repository.save(transaction)
    }
    fun deleteById(id: Long){
        return repository.deleteById(id)
    }
}