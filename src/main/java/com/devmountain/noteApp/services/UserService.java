package com.devmountain.noteApp.services;

import com.devmountain.noteApp.dtos.UserDto;
import com.devmountain.noteApp.entities.User;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

public interface UserService {
    @Transactional
    User addUser(UserDto userDto);

    Optional<User> userLogin(UserDto userDto);

    List<User> getUsers();
}
