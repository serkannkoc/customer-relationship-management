package com.serkan.customerrelationshipmanagement.repository;

import com.serkan.customerrelationshipmanagement.model.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductCategoryRepository extends JpaRepository<ProductCategory,String> {
}
