package com.kk.urlshortener.domain.repository

import com.kk.urlshortener.domain.entity.Achievement
import org.springframework.data.jpa.repository.JpaRepository

interface AchievementRepository : JpaRepository<Achievement, Long>