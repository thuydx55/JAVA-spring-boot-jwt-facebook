package com.eagulyi.user.service;

import com.eagulyi.user.entity.User;
import com.eagulyi.security.auth.ajax.LoginRequest;

import java.util.Optional;

/**
 * Created by eugene on 4/16/17.
 */
public interface UserService {
    Optional<User> getByUsername(String username);

    Optional<User> getByFacebookId(String userId);

    User createDefaultUser(User user);

    User createDefaultUser(LoginRequest request);

    void save(User user);
}