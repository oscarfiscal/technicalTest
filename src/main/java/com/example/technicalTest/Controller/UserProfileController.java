package com.example.technicalTest.Controller;

import com.example.technicalTest.Model.UserProfile;
import com.example.technicalTest.Service.UserProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserProfileController {

    @Autowired
    private UserProfileService userProfileService;

    @PostMapping("/userprofile")
    public void createUserProfile( UserProfile userProfile) {
        userProfileService.createUserProfile(userProfile);
    }

}