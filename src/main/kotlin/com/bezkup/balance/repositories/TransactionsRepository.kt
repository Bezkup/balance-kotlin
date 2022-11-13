package com.bezkup.balance.repositories

import com.bezkup.balance.entity.Transaction
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface TransactionsRepository: JpaRepository<Transaction, Long>