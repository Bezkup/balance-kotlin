package com.bezkup.balance.entity

import org.jetbrains.annotations.NotNull
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.ManyToOne

@Entity
class Transaction(
    @Id @GeneratedValue var id: Long,
    @NotNull var amount: Double,
    @ManyToOne var category: Category,
)