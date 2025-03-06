package com.kk.urlshortener.domain.repository

import com.kk.urlshortener.domain.entity.ProjectSkill
import org.springframework.data.jpa.repository.JpaRepository

interface ProjectSkillRepository : JpaRepository<ProjectSkill, Long>