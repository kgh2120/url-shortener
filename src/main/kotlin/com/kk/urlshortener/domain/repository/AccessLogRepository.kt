package com.kk.urlshortener.domain.repository

import com.kk.urlshortener.domain.entity.AccessLog
import org.springframework.data.jpa.repository.JpaRepository

interface AccessLogRepository:JpaRepository<AccessLog, Int> {
}