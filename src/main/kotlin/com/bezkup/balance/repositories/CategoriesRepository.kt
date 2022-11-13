package com.bezkup.balance.repositories

import com.bezkup.balance.entity.Category
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface CategoriesRepository : JpaRepository<Category,Long>