package com.testing.learning.users.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity //Esta clase representa una tabla de base de datos
@Table(name = "users") //Sirve para indicar el nombre de la tabla
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserEntity {

    @Id //Indica que el atributo será una llave primaria
    //@GeneratedValue(strategy = GenerationType.UUID) Indica que Id se genera automáticamente
    @Column(name = "id", length = 36) //Configura cómo se comporta un atributo como una columna
    private String id;

    @Column(name = "first_name", length = 100) //Length indica tamaño del atributo
    private String firstName;

    @Column(name = "last_name", length = 100)
    private String lastName;

    @Column(name = "email", length = 100)
    private String email;

    @Column(name = "last_connection", length = 100)
    private String lastConnection;

    @Column(name = "country", length = 100)
    private String country;

    @Column(name = "website", length = 100)
    private String website;

    @Column(name = "username", length = 100)
    private String username;

    @Column(name = "followers")
    private Integer followers;

    @Column(name = "following")
    private Integer following;
}
