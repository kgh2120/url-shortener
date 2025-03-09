package com.kk.urlshortener.domain.entity

import jakarta.persistence.*

@Entity
class Link:BaseEntity() {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "link_id")
    var id:Int? = null;

    var shortenUrl:String? = null;
    var originalUrl:String? = null;
    var title:String? = null;
    var description:String? = null;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "users_id")
    var users:Users? = null;
}