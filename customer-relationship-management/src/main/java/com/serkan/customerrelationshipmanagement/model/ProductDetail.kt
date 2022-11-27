package com.serkan.customerrelationshipmanagement.model

import org.hibernate.annotations.GenericGenerator
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.OneToOne
@Entity
data class ProductDetail(
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    val id: String?,
    val name: String?,
    val description: String?,
    @OneToOne(mappedBy = "product_detail")
    val product: Product
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as ProductDetail

        if (id != other.id) return false
        if (name != other.name) return false
        if (description != other.description) return false
        if (product != other.product) return false

        return true
    }

    override fun hashCode(): Int {
        var result = id?.hashCode() ?: 0
        result = 31 * result + (name?.hashCode() ?: 0)
        result = 31 * result + (description?.hashCode() ?: 0)
        result = 31 * result + product.hashCode()
        return result
    }
}
