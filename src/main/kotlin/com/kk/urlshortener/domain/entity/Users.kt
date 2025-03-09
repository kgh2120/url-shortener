package com.kk.urlshortener.domain.entity

import jakarta.persistence.*


@Entity
class Users : BaseEntity() {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "users_id")
    var id:Int? = null;

    var email:String? = null;
    var password:String? = null;

}