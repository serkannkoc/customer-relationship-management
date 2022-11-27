package com.serkan.customerrelationshipmanagement.model

import org.hibernate.annotations.GenericGenerator
import java.time.LocalDateTime
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
@Entity
data class PreRegistration(
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    val id: String?,
    val email: String?,
    val ip: String?,
    val hash: String?,
    val endDate: LocalDateTime = LocalDateTime.now().plusDays(7),

) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as PreRegistration

        if (id != other.id) return false
        if (email != other.email) return false
        if (ip != other.ip) return false
        if (hash != other.hash) return false
        if (endDate != other.endDate) return false

        return true
    }

    override fun hashCode(): Int {
        var result = id?.hashCode() ?: 0
        result = 31 * result + (email?.hashCode() ?: 0)
        result = 31 * result + (ip?.hashCode() ?: 0)
        result = 31 * result + (hash?.hashCode() ?: 0)
        result = 31 * result + endDate.hashCode()
        return result
    }
}
