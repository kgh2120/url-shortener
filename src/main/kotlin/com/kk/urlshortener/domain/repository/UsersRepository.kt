package com.kk.urlshortener.domain.repository

import com.kk.urlshortener.domain.entity.Users
import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

interface UsersRepository:JpaRepository<Users, Int> {

    fun existsByEmail(email: String): Boolean

    fun findByEmailAndPassword(email: String, password: String): Optional<Users>
}