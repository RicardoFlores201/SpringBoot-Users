package com.testing.learning.users.controller;

import com.testing.learning.users.dto.UserDTO;
import com.testing.learning.users.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/*Esta clase es un controlador REST y sus funciones devuelven datos en JSON
    Es una combinación entre @Controller -> Esta clase recibe peticiones web
    y @Response Body -> Indica que lo que se devuelva va directo al body de la respuesta
 */
@RestController

//RequestMapping define una ruta base para el controlador -> Cualquier método dentro de la clase va a partir de la ruta
@RequestMapping("/api/v1/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping //Esta función responderá a peticiones HTTP de tipo GET
    public ResponseEntity<List<UserDTO>> findAll(){ //El endpoint regresa una respuesta HTTP cuyo body contiene una lista de UserDTO
        List<UserDTO> users = userService.findAll();
        return ResponseEntity.ok(users);
    }
}
