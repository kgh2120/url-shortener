package com.kk.urlshortener.domain.repository

import com.kk.urlshortener.domain.entity.AccessLog
import com.kk.urlshortener.domain.entity.Link
import org.springframework.data.jpa.repository.JpaRepository

interface AccessLogRepository:JpaRepository<AccessLog, Int> {

    fun findAllByLinkOrderByIdDesc(link: Link):List<AccessLog>
}