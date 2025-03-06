package com.kk.urlshortener.domain.entity

import jakarta.persistence.*

@Entity
class Project : BaseEntity() {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "project_id")
    private var id: Long? = null
}