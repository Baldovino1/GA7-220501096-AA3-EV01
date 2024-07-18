package com.proyecto.demo.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proyecto.demo.modelo.UserModel;

@Repository
public interface IUserRepositorio extends JpaRepository<UserModel,Long> {

}
