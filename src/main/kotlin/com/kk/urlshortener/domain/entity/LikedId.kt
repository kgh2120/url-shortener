package com.kk.urlshortener.domain.entity

import jakarta.persistence.Embeddable
import java.io.Serializable


@Embeddable
class LikedId : Serializable {


    private var usersId: Int? = null;
    private var linkId: Int? = null;
}