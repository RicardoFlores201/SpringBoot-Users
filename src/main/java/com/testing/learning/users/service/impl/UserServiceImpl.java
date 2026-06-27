package com.testing.learning.users.service.impl;

import com.testing.learning.users.dto.UserDTO;                  //Import DTO -> Data Transfer Object
import com.testing.learning.users.entity.UserEntity;            //Import Entity -> Tabla en PostgreSQL
import com.testing.learning.users.repository.UserRepository;    //Import Repository -> Capa que se comunica con BD
import com.testing.learning.users.service.UserService;          //Import Service -> Contrato - Implementar métodos
import org.springframework.beans.factory.annotation.Autowired;  //Anotación -> Inyectar instancia de UserRepository
import org.springframework.stereotype.Service;                  //Service -> Marca la clase como componente de servicio

import java.util.ArrayList;
import java.util.List;

/*Capa de Servicio: Contiene lógica de negocio o la coordinación entre
    repositorios, validaciones y transformaciones.
 */
@Service //Spring detecta esta clase y la registra como Bean
public class UserServiceImpl implements UserService {

    //Usar @Autowired evita que se realice -> UserRepository userRepository = new UserRepository();
    @Autowired
    private UserRepository userRepository; //El servicio necesita usar UserRepository para consultar la BD

    /*También es recomendable usar la inyección por constructor en vez de inyección directa
        private final UserRepository userRepository;

        public UserServiceImpl(UserRepository userRepository) {
            this.userRepository = userRepository;
        }
     */


    @Override //Implementar método que viene de una interfaz
    public List<UserDTO> findAll(){ //Regresa una lista de DTO

        List<UserEntity> users = userRepository.findAll();  //Consulta todos los registros en la BD como Entity
                                                            //findAll() viene de JpaRepository

        List<UserDTO> response = new ArrayList<>();         //Se crea una lista para retornar los DTOs

        //Mapeo de entidad a DTO
        for (UserEntity u : users ){
            UserDTO dto = new UserDTO(
                    u.getId(),
                    u.getFirstName(),
                    u.getLastName(),
                    u.getEmail(),
                    u.getCountry(),
                    u.getWebsite(),
                    u.getUsername(),
                    u.getFollowers(),
                    u.getFollowing()
            );
            response.add(dto); //Agregar el DTO a la lista de la respuesta
        }
        return response; //Se retorna la respuesta
    }

}
