package com.serkan.customerrelationshipmanagement.repository;

import com.serkan.customerrelationshipmanagement.model.ProductDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductDetailRepository extends JpaRepository<ProductDetail,String> {
}
