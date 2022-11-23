package com.bezkup.balance.controller

import com.bezkup.balance.entity.Transaction
import com.bezkup.balance.services.TransactionService
import com.fasterxml.jackson.databind.util.JSONPObject
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("api/v1/transactions")
class TransactionController @Autowired constructor(service: TransactionService) {

    val transactionService: TransactionService = service

    @RequestMapping(method = [RequestMethod.GET])
    fun getAllTransaction(): List<Transaction>? {
        return transactionService.getAllTransaction()
    }

    @RequestMapping(value = ["/{id}"], method = [RequestMethod.GET])
    fun getTransactionById(@PathVariable("id") id: Long): Transaction? {
        return transactionService.searchById(id)
    }

    @RequestMapping(method = [RequestMethod.PUT])
    fun addTransaction(@RequestBody request: Transaction): Map<String, String> {
        transactionService.save(request)
        return mapOf("result" to "ok")
    }
}
