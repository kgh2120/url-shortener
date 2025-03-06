package com.kk.urlshortener.domain.repository

import com.kk.urlshortener.domain.entity.Achievement
import com.kk.urlshortener.domain.entity.Experience
import org.springframework.data.jpa.repository.JpaRepository

interface ExperienceRepository : JpaRepository<Experience, Long> {
}