package com.serkan.customerrelationshipmanagement.service;

import com.serkan.customerrelationshipmanagement.dto.UserInformationDto;
import com.serkan.customerrelationshipmanagement.model.User;
import com.serkan.customerrelationshipmanagement.repository.UserInformationRepository;
import org.springframework.stereotype.Service;

@Service
public class UserInformationService {
    private final UserInformationRepository userInformationRepository;
    private final UserService userService;

    public UserInformationService(UserInformationRepository userInformationRepository, UserService userService) {
        this.userInformationRepository = userInformationRepository;
        this.userService = userService;
    }

    public UserInformationDto getUserInformation(String userId){
        User user = userService.getUserById(userId);
    }
}
