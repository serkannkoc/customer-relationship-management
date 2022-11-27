package com.serkan.customerrelationshipmanagement.model

import org.hibernate.annotations.GenericGenerator
import javax.persistence.*

data class Sale(
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    val id: String?,

    @ManyToOne(fetch = FetchType.LAZY, cascade = [CascadeType.ALL])
    @JoinColumn(name = "user_id", nullable = false)
    val user: User,

    @ManyToOne(fetch = FetchType.LAZY, cascade = [CascadeType.ALL])
    @JoinColumn(name = "product_id", nullable = false)
    val product: Product
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Sale

        if (id != other.id) return false
        if (user != other.user) return false
        if (product != other.product) return false

        return true
    }

    override fun hashCode(): Int {
        var result = id?.hashCode() ?: 0
        result = 31 * result + user.hashCode()
        result = 31 * result + product.hashCode()
        return result
    }
}
