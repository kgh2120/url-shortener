package com.kk.urlshortener.domain.entity

import jakarta.persistence.MappedSuperclass

@MappedSuperclass
class BaseEntity {

    private var createdDate: Long? = null;
    private var modifiedDate: Long? = null;
}