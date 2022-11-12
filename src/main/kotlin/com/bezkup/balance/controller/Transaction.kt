package com.bezkup.balance.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody

@Controller
@RequestMapping("transaction")
class Transaction {

    @GetMapping("/")
    @ResponseBody
    fun test(): String {
        return "ciao"
    }
}