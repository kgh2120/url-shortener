package com.kk.urlshortener.domain.entity

import jakarta.persistence.*

@Entity
class HttpInterface : BaseEntity() {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "httpInterface_id")
    private var id: Long? = null
}