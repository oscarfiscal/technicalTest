package com.example.technicalTest.Service;

import com.example.technicalTest.Model.UserProfile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class UserProfileService {

    @Autowired
    private RestTemplate restTemplate;

    @Value("${api.url}")
    private String apiUrl;

    public void createUserProfile(UserProfile userProfile) {
        restTemplate.postForObject(apiUrl, userProfile, UserProfile.class);
    }

    public UserProfile[] getAllUserProfiles() {
        return restTemplate.getForObject(apiUrl, UserProfile[].class);
    }

}
