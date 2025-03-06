package com.kk.urlshortener.domain.entity

import jakarta.persistence.*

@Entity
class Introduction : BaseEntity() {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "introduction_id")
    private var id: Long? = null
}