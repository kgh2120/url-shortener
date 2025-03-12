package com.kk.urlshortener.domain.repository

import com.kk.urlshortener.domain.entity.Users
import org.springframework.data.jpa.repository.JpaRepository

interface UsersRepository:JpaRepository<Users, Int> {
}