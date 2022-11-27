package com.serkan.customerrelationshipmanagement.repository;

import com.serkan.customerrelationshipmanagement.model.ProductUserPermission;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductUserPermissionRepository extends JpaRepository<ProductUserPermission,String> {
}
