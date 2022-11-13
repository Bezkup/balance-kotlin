package com.bezkup.balance.services

import com.bezkup.balance.entity.Transaction
import com.bezkup.balance.repositories.TransactionsRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service
import java.util.*

@Service
class TransactionService(val repository: TransactionsRepository) {
    fun getAllTransaction(): List<Transaction>? {
        return repository.findAll()
    }
    fun searchById(id: Long): Transaction? {
        return repository.findByIdOrNull(id)
    }
    fun save(transaction: Transaction): Transaction {
        return repository.save(transaction)
    }
    fun deleteById(id: Long){
        return repository.deleteById(id)
    }
}