package com.kk.urlshortener.domain.entity

import jakarta.persistence.*

@Entity
class ExperienceDetail : BaseEntity() {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "experience_detail_id")
    private var id: Long? = null
}