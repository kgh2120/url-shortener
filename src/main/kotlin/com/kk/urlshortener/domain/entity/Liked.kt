package com.kk.urlshortener.domain.entity

import jakarta.persistence.*

@Entity
class Liked:BaseEntity() {

    @EmbeddedId
    var likedId : LikedId? = null;


    @MapsId("usersId")
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private var users:Users? = null;

    @MapsId("linkId")
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "link_id")
    private var linkId:Link? = null;

}