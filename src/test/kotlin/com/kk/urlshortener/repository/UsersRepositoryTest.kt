package com.kk.urlshortener.repository

import com.kk.urlshortener.domain.entity.Users
import com.kk.urlshortener.domain.repository.UsersRepository
import org.assertj.core.api.Assertions
import org.assertj.core.api.Assertions.*
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest

@DataJpaTest
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class UsersRepositoryTest(
    @Autowired val usersRepository: UsersRepository
) {

    @BeforeAll
    fun beforeAll(){
        // 테스트 유저 생성
        var users = Users(
            email = "tester@gmail.com",
            password = "1q2w3e4r"
        )
        usersRepository.save(users)

    }

    @DisplayName("이메일 중복 검사 테스트 - 이미 저장된 경우")
    @Test
    fun existEmailTrueTest(){
        //when
        val sut = usersRepository.existsByEmail("tester@gmail.com")
        // then
        assertThat(sut).isTrue()
    }
    @DisplayName("이메일 중복 검사 테스트 - 새로운 이메일인 경우")
    @Test
    fun existEmailFalseTest(){
        //when
        val sut = usersRepository.existsByEmail("tester@namver.com")
        // then
        assertThat(sut).isFalse()
    }

    @DisplayName("아이디와 패스워드로 조회 테스트 - 성공의 경우")
    @Test
    fun loginSuccessTest(){
        //given
        var email = "tester@gmail.com"
        var password = "1q2w3e4r"

        // when
        val sut = usersRepository.findByEmailAndPassword(email, password)

        // then
        assertThat(sut).isPresent()
        assertThat(sut.get().email).isEqualTo(email)
        assertThat(sut.get().password).isEqualTo(password)
    }

    @DisplayName("아이디와 패스워드로 - 실패의 경우")
    @Test
    fun loginFailTest(){
        //given
        var email = "tester@naver.com"
        var password = "1q2w3e4r"

        // when
        val sut = usersRepository.findByEmailAndPassword(email, password)

        // then
        assertThat(sut).isEmpty()

    }

}