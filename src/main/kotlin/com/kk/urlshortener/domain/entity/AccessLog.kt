package com.kk.urlshortener.domain.entity

import jakarta.persistence.*

@Entity
class AccessLog(
    link: Link
) : BaseEntity() {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "access_log_id")
    var id: Int? = null

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "link_id", nullable = false)
    var link: Link = link


}