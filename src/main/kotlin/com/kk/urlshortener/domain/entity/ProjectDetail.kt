package com.kk.urlshortener.domain.entity

import jakarta.persistence.*

@Entity
class ProjectDetail : BaseEntity() {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "project_detail_id")
    private var id: Long? = null
}