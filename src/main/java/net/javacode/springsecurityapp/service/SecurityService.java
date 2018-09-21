package net.javacode.springsecurityapp.service;

/**
 * Service for security
 */

public interface SecurityService {

    String findLoggedInUsername();

    void autoLogin(String username, String password);
}
