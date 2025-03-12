package com.kk.urlshortener.domain.repository

import com.kk.urlshortener.domain.entity.Link
import com.kk.urlshortener.domain.entity.Users
import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

interface LinkRepository:JpaRepository<Link,Int> {

    // link목록 조회
    fun findAllLinkByUsers(users: Users) : List<Link>

    fun findLinkByShortenUrl(shortenUrl: String) : Optional<Link>

    fun existsLinkByShortenUrl(shortenUrl: String) : Boolean
}