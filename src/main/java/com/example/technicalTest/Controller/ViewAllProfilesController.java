package com.example.technicalTest.Controller;

import com.example.technicalTest.Service.UserProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewAllProfilesController {

    @Autowired
    private UserProfileService userProfileService;

    @GetMapping("/viewAllProfiles")
    public String viewAllProfiles(Model model) {
        // Obtener todos los perfiles de usuario del servicio
        model.addAttribute("profiles", userProfileService.getAllUserProfiles());
        // Devolver la vista que muestra todos los perfiles en forma de tabla
        return "allProfiles";
    }
}
