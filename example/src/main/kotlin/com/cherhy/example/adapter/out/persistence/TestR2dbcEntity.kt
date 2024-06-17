package com.cherhy.example.adapter.out.persistence

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table

@Table("test")
data class TestR2dbcEntity(
    @Id
    val id: Long = 0,
    val name: String,
    val status: String,
)