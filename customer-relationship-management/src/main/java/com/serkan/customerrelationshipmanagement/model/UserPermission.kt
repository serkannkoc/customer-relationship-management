package com.serkan.customerrelationshipmanagement.model

import javax.persistence.*

@Entity
data class UserPermission(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int,
    val type: Type?,

    @OneToMany(mappedBy = "userPermission", fetch = FetchType.EAGER)
    val productUserPermission: Set<ProductUserPermission>
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as UserPermission

        if (id != other.id) return false
        if (type != other.type) return false
        if (productUserPermission != other.productUserPermission) return false

        return true
    }

    override fun hashCode(): Int {
        var result = id
        result = 31 * result + (type?.hashCode() ?: 0)
        return result
    }
}

enum class Type {
    GOLD, PLATIN, CHROMIUM
}
