package com.serkan.customerrelationshipmanagement.model

import org.hibernate.annotations.GenericGenerator
import java.math.BigDecimal
import javax.persistence.*

@Entity
data class Product(
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    val id: String?,
    @OneToOne
    @JoinColumn(name = "product_detail_id")
    val productDetail: ProductDetail?,

    @ManyToOne
    @JoinColumn(name = "product_category_id", referencedColumnName = "id")
    val productCategory: ProductCategory?,
    val price: BigDecimal?,

    @OneToMany(mappedBy = "product")
    val sales: Set<Sale>,
    @OneToMany(mappedBy = "product")
    val productUserPermission: Set<ProductUserPermission>


) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Product

        if (id != other.id) return false
        if (productDetail != other.productDetail) return false
        if (productCategory != other.productCategory) return false
        if (price != other.price) return false
        if (sales != other.sales) return false
        if (productUserPermission != other.productUserPermission) return false

        return true
    }

    override fun hashCode(): Int {
        var result = id?.hashCode() ?: 0
        result = 31 * result + (productDetail?.hashCode() ?: 0)
        result = 31 * result + (productCategory?.hashCode() ?: 0)
        result = 31 * result + (price?.hashCode() ?: 0)
        return result
    }


}
