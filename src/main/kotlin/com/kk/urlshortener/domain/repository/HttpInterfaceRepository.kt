package com.kk.urlshortener.domain.repository

import com.kk.urlshortener.domain.entity.HttpInterface
import org.springframework.data.jpa.repository.JpaRepository

interface HttpInterfaceRepository : JpaRepository<HttpInterface, Long>