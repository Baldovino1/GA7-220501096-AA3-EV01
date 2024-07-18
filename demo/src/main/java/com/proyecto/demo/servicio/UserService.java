package com.proyecto.demo.servicio;

import com.proyecto.demo.modelo.UserModel;
import com.proyecto.demo.repositorio.IUserRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    IUserRepositorio userRepositorio;

    //Metodo para obtener todos los usuarios
    public ArrayList<UserModel> getuser(){
        return (ArrayList<UserModel>) userRepositorio.findAll();
    } 
    //Metodo para guardar usuarios
    public UserModel saveUser(UserModel user){
        return userRepositorio.save(user);
    } 
    //Metodo para obtener usuario por medio del id
    public Optional <UserModel> getById(Long id){
        return userRepositorio.findById(id);
    }

    //Metodo para actualizar
    public UserModel updateById(UserModel request, Long id){
        UserModel user = userRepositorio.findById(id).get();

        user.setNombre(request.getNombre());
        user.setApellido(request.getApellido());
        user.setCorreo(request.getCorreo());

        return user;
    }
    //Metodo para eliminar
    public boolean deleteUser (Long id){
        try{
            userRepositorio.deleteById(id);
            return true;
        }catch (Exception e){
            return false;
        }
    }



}
