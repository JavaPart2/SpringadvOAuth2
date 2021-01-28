package be.hvwebsites.oauth.security;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    public void configure(HttpSecurity http) throws Exception{
        http.oauth2Login();
        http.authorizeRequests(requests -> requests
                .mvcMatchers("/").permitAll()
                .mvcMatchers("beveiligd").authenticated());
    }
}
