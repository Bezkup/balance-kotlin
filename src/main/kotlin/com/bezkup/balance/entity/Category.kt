package com.bezkup.balance.entity

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
class Category (
    var category: String,
    @Id @GeneratedValue var id: Long
)