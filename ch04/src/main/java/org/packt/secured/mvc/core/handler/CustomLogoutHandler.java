package org.packt.secured.mvc.core.handler;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.DefaultRedirectStrategy;
import org.springframework.security.web.RedirectStrategy;
import org.springframework.security.web.authentication.logout.SimpleUrlLogoutSuccessHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Component
public class CustomLogoutHandler extends SimpleUrlLogoutSuccessHandler {
    private RedirectStrategy redirectStrategy = new DefaultRedirectStrategy();

    @Override
    public void onLogoutSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException, ServletException {
        String targetUrl = targetUrl(authentication);
        if (response.isCommitted()){
            System.err.println("Can't redirect");
            return;
        }
        redirectStrategy.sendRedirect(request, response, targetUrl);
    }

    private String targetUrl(Authentication authentication) {
        Collection<? extends GrantedAuthority> authorities = authentication.getAuthorities();
        String username;
        String password;
        String url = "";

        try
        {
            UserDetails p = (UserDetails) authentication.getPrincipal();
            username = p.getUsername();
            password = p.getPassword();

            authorities = p.getAuthorities();

            System.out.println(authentication.isAuthenticated());

            List<String> roles = new ArrayList<>();
            for (GrantedAuthority a: authorities){
                roles.add(a.getAuthority());
            }
            System.out.println("logout handler " + roles);

            if (isUser(roles)) {
                url = "/after_logout.html?message="+"Thank your, "+ username +" with password " + password +" and role(s): " + roles;
            } else if (isAdmin(roles)){
                url = "/after_logout.html?message="+"Thank your, "+ username +" with password " + password +" and role(s): " + roles;
            } else if (isHrAdmin(roles)){
                url = "/after_logout.html?message="+"Thank your, "+ username +" with password " + password +" and role(s): " + roles;
            } else{
                url = "/after_logout.html?message="+"Thank you, friend!";
            }

        } catch (Exception e){
            System.out.println(authentication.getPrincipal());
            username = (String) authentication.getPrincipal();

            authorities = authentication.getAuthorities();

            System.out.println(authentication.isAuthenticated());

            List<String> roles = new ArrayList<String>();
            for (GrantedAuthority a : authorities){
                roles.add(a.getAuthority());
            }
            System.out.println("logout handler " + roles);
            if (isUser(roles)) {
                url = "/after_logout.html?message="+"Thank your, User!";
            } else if (isAdmin(roles)){
                url = "/after_logout.html?message="+"Thank your, Admin!";
            } else if (isHrAdmin(roles)){
                url = "/after_logout.html?message="+"Thank your, HR Admin!";
            } else{
                url = "/after_logout.html?message="+"Thank you, friend!";
            }
        }

        return url;
    }

    private boolean isUser(List<String> roles){
        if (roles.contains("ROLE_USER")){
            return true;
        }
        return false;
    }

    private boolean isAdmin(List<String> roles){
        if (roles.contains("ROLE_ADMIN")){
            return true;
        }
        return false;
    }

    private boolean isHrAdmin(List<String> roles){
        if (roles.contains("ROLE_HR")){
            return true;
        }
        return false;
    }
}
