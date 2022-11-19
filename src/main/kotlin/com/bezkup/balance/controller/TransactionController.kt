package com.bezkup.balance.controller

import com.bezkup.balance.entity.Transaction
import com.bezkup.balance.services.TransactionService
import com.fasterxml.jackson.databind.util.JSONPObject
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("api/v1/transaction")
class TransactionController @Autowired constructor(service: TransactionService) {

    val transactionService: TransactionService = service

    @RequestMapping(method = [RequestMethod.GET])
    fun getAllTransaction(): List<Transaction>? {
        return transactionService.getAllTransaction()
    }

    @RequestMapping(method = [RequestMethod.PUT])
    fun addTransaction(@RequestBody request: Transaction): JSONPObject{
        transactionService.save(request)
        return JSONPObject("result","ok")
    }
}