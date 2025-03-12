package com.kk.urlshortener.domain.entity

import jakarta.persistence.*


@Entity
class Users(
    email: String,
    password: String
) : BaseEntity() {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "users_id")
    var id: Int? = null

    var email: String = email
    var password: String = password


    @OneToMany(cascade = [(CascadeType.ALL)], mappedBy = "users")
    var links: MutableList<Link> = mutableListOf()

    fun addLink(link: Link) {
        this.links.add(link)
        link.associateWithUser(this)
    }

}