package com.example.pp_3_1_3_bootstrap.service;


import com.example.pp_3_1_3_bootstrap.models.User;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface UserService {
    List<User> listUser ();
    User getUserById (int id);
    void addUser (User user);
    void removeUser (int id);
    void updateUser (User user);
}
