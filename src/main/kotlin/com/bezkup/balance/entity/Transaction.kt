package com.bezkup.balance.entity

import org.jetbrains.annotations.NotNull
import javax.persistence.*

@Entity
class Transaction(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) var id: Long,
    @NotNull var amount: Double,
    @ManyToOne(cascade= [CascadeType.ALL]) var category: Category,
)