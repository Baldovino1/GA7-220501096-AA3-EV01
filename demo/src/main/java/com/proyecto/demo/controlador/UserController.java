package com.proyecto.demo.controlador;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto.demo.modelo.UserModel;
import com.proyecto.demo.servicio.UserService;


 
@RestController
@RequestMapping("/user")

public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public ArrayList <UserModel> getUsers(){
        return this.userService.getuser();
    }
    
    @PostMapping
    public UserModel saveUserModel(@RequestBody UserModel user) {
        return this.userService.saveUser(user);
    }
     
    @GetMapping("path = /{id}")
    public Optional <UserModel> getUserById(@PathVariable("id")Long id) {
        return this.userService.getById (id);
    }

    @PutMapping(path = "/{id}")
    public UserModel updateUserById(@RequestBody UserModel request,@PathVariable ("id")Long id){
        return this.userService.updateById(request,id);
    }
        
    @DeleteMapping(path = "/{id}")
    public String deleteById(@PathVariable("id")long id){
        boolean ok = this.userService.deleteUser(id);

        if(ok){
            return "User with id" + id + "delete!";
        }else {
            return "Error sapa";
        }
    }
}

    
   
