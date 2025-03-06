package com.kk.urlshortener.domain.entity

import jakarta.persistence.*

@Entity
class Skill : BaseEntity() {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "skill_id")
    private var id: Long? = null
}