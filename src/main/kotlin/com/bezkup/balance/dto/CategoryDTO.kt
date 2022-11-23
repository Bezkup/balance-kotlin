package com.bezkup.balance.dto

import com.fasterxml.jackson.annotation.JsonProperty

class CategoryDTO (
    @JsonProperty("id")
    val id: Long,

    @JsonProperty("name")
    val name: String
)