package com.kk.urlshortener.domain.repository

import com.kk.urlshortener.domain.entity.Achievement
import com.kk.urlshortener.domain.entity.Skill
import org.springframework.data.jpa.repository.JpaRepository

interface SkillRepository : JpaRepository<Skill, Long> {
}