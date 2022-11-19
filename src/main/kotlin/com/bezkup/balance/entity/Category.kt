package com.bezkup.balance.entity

import org.jetbrains.annotations.NotNull
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
class Category (
    @NotNull
    @Column(name = "name", nullable = false, unique = true, updatable = true)
    var name: String,
    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false, updatable = false)
    var id: Long
)