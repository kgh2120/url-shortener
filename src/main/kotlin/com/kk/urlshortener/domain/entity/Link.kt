package com.kk.urlshortener.domain.entity

import jakarta.persistence.*

@Entity
class Link(
    shortenUrl: String,
    originalUrl: String,
    title: String,
) : BaseEntity() {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "link_id")
    var id: Int? = null

    var shortenUrl: String = shortenUrl
    var originalUrl: String = originalUrl
    var title: String = title

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "users_id")
    var users: Users? = null

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "link", cascade = [CascadeType.PERSIST])
    var accessLog: MutableList<AccessLog> = mutableListOf()

    fun associateWithUser(user:Users){
        this.users = user;
    }

    fun addAccessLog(accessLog: AccessLog) {
        this.accessLog.add(accessLog)
    }
}