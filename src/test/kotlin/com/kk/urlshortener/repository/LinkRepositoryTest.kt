package com.kk.urlshortener.repository

import com.kk.urlshortener.domain.entity.Link
import com.kk.urlshortener.domain.entity.Users
import com.kk.urlshortener.domain.repository.LinkRepository
import com.kk.urlshortener.domain.repository.UsersRepository
import org.assertj.core.api.Assertions
import org.assertj.core.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest

@DataJpaTest
class LinkRepositoryTest(
    @Autowired val linkRepository: LinkRepository,
    @Autowired val usersRepository: UsersRepository
) {

    @BeforeEach
    fun beforeEach() {
        // 유저 하나 만들고 링크 2개 만들기

        var links = mutableListOf<Link>(
            Link(
                shortenUrl = "1111",
                originalUrl = "github.com",
                title = "github"
            ),
            Link(
                shortenUrl = "2222",
                originalUrl = "google.com",
                title = "google"
            )
        )

        var users = Users(
            email = "tester@gmail.com",
            password = "1q2w3e4r"
        )

        users.addLinks(links)

        usersRepository.save(users)

        var noLinkUser = Users(
            email = "tester@naver.com",
            password = "1q2w3e4r"
        )
        usersRepository.save(noLinkUser)

    }

    @DisplayName("회원 정보로 링크 조회 테스트 - 링크가 존재하는 경우")
    @Test
    fun findAllLinkTest(){
        // given
        var email = "tester@gmail.com"
        var password = "1q2w3e4r";
        val user = usersRepository.findByEmailAndPassword(email, password).get()

        //when
        val sut = linkRepository.findAllLinkByUsers(user);

        // then
        assertThat(sut).hasSize(2);
    }

    @DisplayName("회원 정보로 링크 조회 테스트 - 링크가 없는 경우")
    @Test
    fun findAllLinkEmptyTest(){
        // given
        var email = "tester@naver.com"
        var password = "1q2w3e4r";
        val user = usersRepository.findByEmailAndPassword(email, password).get()

        //when
        val sut = linkRepository.findAllLinkByUsers(user);

        // then
        assertThat(sut).isEmpty()
    }

    @DisplayName("단축 URL 중복 테스트 - 중복된 경우")
    @Test
    fun existLinkByShortenUrlFindTest(){
        // given
        var shortenUrl = "1111";

        // when
        val sut = linkRepository.existsLinkByShortenUrl(shortenUrl)

        //then
        assertThat(sut).isTrue()
    }

    @DisplayName("단축 URL 중복 테스트 - 중복 아닌 경우")
    @Test
    fun existLinkByShortenUrlCantFindTest(){
        // given
        var shortenUrl = "aaaa";

        // when
        val sut = linkRepository.existsLinkByShortenUrl(shortenUrl)

        //then
        assertThat(sut).isFalse()
    }


    @DisplayName("단축 URL로 Link 정보 찾기 테스트 - 존재하는 경우")
    @Test
    fun findLinkByShortenUrlFindTest(){
        // given
        var shortenUrl = "1111";

        // when
        val sut = linkRepository.findLinkByShortenUrl(shortenUrl)

        //then
        assertThat(sut).isPresent()
    }

    @DisplayName("단축 URL로 Link 정보 찾기 테스트 - 없는 경우")
    @Test
    fun findLinkByShortenUrlUrlCantFindTest(){
        // given
        var shortenUrl = "aaaa";

        // when
        val sut = linkRepository.findLinkByShortenUrl(shortenUrl)

        //then
        assertThat(sut).isEmpty()
    }



}