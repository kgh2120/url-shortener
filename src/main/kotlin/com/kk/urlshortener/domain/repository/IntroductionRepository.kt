package com.kk.urlshortener.domain.repository

import com.kk.urlshortener.domain.entity.Achievement
import com.kk.urlshortener.domain.entity.Experience
import com.kk.urlshortener.domain.entity.HttpInterface
import com.kk.urlshortener.domain.entity.Introduction
import org.springframework.data.jpa.repository.JpaRepository

interface IntroductionRepository : JpaRepository<Introduction, Long> {
}