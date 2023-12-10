package com.solution.services.impl;

import com.solution.dto.UserDTO;
import com.solution.entity.User;
import com.solution.repository.UserRepository;
import com.solution.services.USerService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class USerServiceImpl implements USerService {

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private UserRepository repository;
    @Override
    public UserDTO gravaUsuario(UserDTO userDTO) {

        var user = new User();
        user.setNome(userDTO.getNome());
        user.setEmail(userDTO.getEmail());

        var newUSer = repository.save(user);

        return modelMapper.map(newUSer, UserDTO.class);
    }

    @Override
    public List<UserDTO> buscaTodos() {
        var usuarios = repository.findAll();

        return usuarios.stream()
                .map(u -> modelMapper.map(u, UserDTO.class))
                .collect(Collectors.toList());
    }
}
