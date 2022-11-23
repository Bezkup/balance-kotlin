package com.bezkup.balance.dto

import com.fasterxml.jackson.annotation.JsonProperty

class TransactionDTO (
    @JsonProperty("amount")
    val amount: Long,
    @JsonProperty("category")
    val categoryDTO: CategoryDTO
)