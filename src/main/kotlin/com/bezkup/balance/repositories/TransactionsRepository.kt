package com.bezkup.balance.repositories

import com.bezkup.balance.entity.Transaction
import org.springframework.data.repository.CrudRepository

interface TransactionsRepository: CrudRepository<Transaction, Long> {
    fun searchById(id: Long): Transaction?
    fun getAllTransaction(): List<Transaction>?
}