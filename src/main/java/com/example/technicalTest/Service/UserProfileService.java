package com.example.technicalTest.Service;

import com.example.technicalTest.Model.UserProfile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class UserProfileService {

    @Autowired
    private RestTemplate restTemplate;

    private static final String API_URL = "https://65ce3649c715428e8b40344b.mockapi.io/api/profile";

    public void createUserProfile(UserProfile userProfile) {
        restTemplate.postForObject(API_URL, userProfile, UserProfile.class);
    }

}