package be.hvwebsites.oauth.controllers;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/beveiligd")
public class BeveiligdeController {
    @GetMapping
    public ModelAndView securedPage(@AuthenticationPrincipal OAuth2User user){
        return new ModelAndView("beveiligd", "gebruikersNaam",
                user.getAttribute("login"));
    }
}
