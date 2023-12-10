package com.solution.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {

    private Long id;

    @NotBlank(message = "O nome não pode estar em branco")
    private String nome;

    @Email(message = "O e-mail deve ser válido")
    private String email;

}
