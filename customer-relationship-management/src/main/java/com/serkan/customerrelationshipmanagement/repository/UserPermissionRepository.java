package com.serkan.customerrelationshipmanagement.repository;

import com.serkan.customerrelationshipmanagement.model.UserPermission;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserPermissionRepository extends JpaRepository<UserPermission,Integer> {
}
