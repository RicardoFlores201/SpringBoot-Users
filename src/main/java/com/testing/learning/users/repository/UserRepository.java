package com.testing.learning.users.repository;

import com.testing.learning.users.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

//El String en JpaRepository<UserEntity, String> es el tipo de dato del @Id
public interface UserRepository extends JpaRepository<UserEntity, String> {
}
