package com.bezkup.balance.entity

import org.jetbrains.annotations.NotNull
import javax.persistence.*

@Entity
class Category (
    @NotNull
    @Column(name = "name", nullable = false, unique = true, updatable = true)
    var name: String,
){
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, updatable = false)
    var id: Long = 0
}