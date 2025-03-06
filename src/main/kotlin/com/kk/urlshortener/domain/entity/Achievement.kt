package com.kk.urlshortener.domain.entity

import jakarta.persistence.*

@Entity
class Achievement : BaseEntity() {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "achievement_id")
    private var id: Long? = null
}