package com.kk.urlshortener.domain

import com.kk.urlshortener.domain.entity.Link
import com.kk.urlshortener.domain.entity.Users
import com.kk.urlshortener.domain.repository.AccessLogRepository
import com.kk.urlshortener.domain.repository.LinkRepository
import com.kk.urlshortener.domain.repository.UsersRepository
import jakarta.annotation.PostConstruct
import org.slf4j.LoggerFactory
import org.springframework.context.annotation.Profile
import org.springframework.stereotype.Component


@Component
@Profile(value = ["default"])
class DataInitializer(
    private val usersRepository: UsersRepository,
    private val linkRepository: LinkRepository,
    private val accessLogRepository: AccessLogRepository
) {

    private val log = LoggerFactory.getLogger(DataInitializer::class.java)

    @PostConstruct
    fun initializeData() {
        log.info("스프링 시작! 데이터 초기화 진행중..")


        val link = Link(
            title = "내 깃허브",
            shortenUrl = "testshort",
            originalUrl = "github.com"
        )


        val user = Users(
            email = "tester@gmail.com",
            password = "1q2w3e4r"
        );
        user.addLink(link);

        usersRepository.save(user);


    }

}