package com.kk.urlshortener.domain.repository

import com.kk.urlshortener.domain.entity.Link
import org.springframework.data.jpa.repository.JpaRepository

interface LinkRepository : JpaRepository<Link, Long>