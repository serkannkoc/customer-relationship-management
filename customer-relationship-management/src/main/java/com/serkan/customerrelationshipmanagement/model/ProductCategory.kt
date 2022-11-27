package com.serkan.customerrelationshipmanagement.model

import org.hibernate.annotations.GenericGenerator
import javax.persistence.*

@Entity
data class ProductCategory(
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    val id: String?,
    val name: String?,
    @OneToMany(mappedBy = "product_category", fetch = FetchType.EAGER)
    val products: Set<Product>
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as ProductCategory

        if (id != other.id) return false
        if (name != other.name) return false
        if (products != other.products) return false

        return true
    }

    override fun hashCode(): Int {
        var result = id?.hashCode() ?: 0
        result = 31 * result + (name?.hashCode() ?: 0)
        return result
    }
}
