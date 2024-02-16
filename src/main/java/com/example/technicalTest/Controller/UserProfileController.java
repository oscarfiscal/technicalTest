package com.example.technicalTest.Controller;

import com.example.technicalTest.Model.UserProfile;
import com.example.technicalTest.Service.UserProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class UserProfileController {

    public static final String FORM_VIEW = "index";
    public static final String RESULT_VIEW = "profileInfo";

    @Autowired
    private UserProfileService userProfileService;

    @RequestMapping("/")
    public String showForm(Model model) {
        model.addAttribute("userProfile", new UserProfile());
        return FORM_VIEW;
    }

    @PostMapping("/userprofile")
    public ModelAndView createUserProfile(@ModelAttribute("userProfile") UserProfile userProfile) {
        userProfileService.createUserProfile(userProfile);
        ModelAndView mav = new ModelAndView(RESULT_VIEW);
        mav.addObject("userProfile", userProfile);
        return mav;
    }
}
