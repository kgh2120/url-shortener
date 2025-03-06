package com.kk.urlshortener.domain.repository

import com.kk.urlshortener.domain.entity.Project
import org.springframework.data.jpa.repository.JpaRepository

interface ProjectRepository : JpaRepository<Project, Long>