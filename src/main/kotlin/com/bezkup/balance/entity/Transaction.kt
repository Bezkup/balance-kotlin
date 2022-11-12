package com.bezkup.balance.entity

import javax.persistence.Entity
import javax.persistence.OneToMany

@Entity
class Transaction(
    var id: Long,
    var amount: Double,
    @OneToMany var category: Category,
)