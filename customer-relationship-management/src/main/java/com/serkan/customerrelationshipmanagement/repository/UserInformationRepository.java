package com.serkan.customerrelationshipmanagement.repository;

import com.serkan.customerrelationshipmanagement.model.UserInformation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserInformationRepository extends JpaRepository<UserInformation,String> {
}
