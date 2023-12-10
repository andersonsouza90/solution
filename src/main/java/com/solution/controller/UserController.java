package com.solution.controller;

import com.solution.dto.UserDTO;
import com.solution.services.USerService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private USerService service;

    @PostMapping
    public ResponseEntity<UserDTO> criaUsuario(@Valid @RequestBody UserDTO user){

        var usuario = service.gravaUsuario(user);

        return ResponseEntity.status(HttpStatus.CREATED).body(usuario);

    }

    @GetMapping
    public ResponseEntity<List<UserDTO>> buscaTodos(){
        return ResponseEntity.status(HttpStatus.OK).body(service.buscaTodos());
    }
}
