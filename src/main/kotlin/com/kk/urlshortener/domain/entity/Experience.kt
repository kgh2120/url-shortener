package com.kk.urlshortener.domain.entity

import jakarta.persistence.*

@Entity
class Experience : BaseEntity() {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "experience_id")
    private var id: Long? = null
}