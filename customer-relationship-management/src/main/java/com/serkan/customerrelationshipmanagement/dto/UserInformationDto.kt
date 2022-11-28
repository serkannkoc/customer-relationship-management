package com.serkan.customerrelationshipmanagement.dto

import com.serkan.customerrelationshipmanagement.model.User

data class UserInformationDto(
        val id: String?,
        val user: User,
        val name: String?,
        val surname: String?,
        val country: String?,
)
