package com.testing.learning.users.service;

import com.testing.learning.users.dto.UserDTO;

import java.util.List;

//Define qué funciones ofrece el servicio
// para que UserServiceImpl defina el cómo se hacen las funciones
public interface UserService {
    List<UserDTO> findAll();
}
