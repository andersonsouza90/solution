package com.solution.services;

import com.solution.dto.UserDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface USerService {

    UserDTO gravaUsuario(UserDTO user);

    List<UserDTO> buscaTodos();
}
