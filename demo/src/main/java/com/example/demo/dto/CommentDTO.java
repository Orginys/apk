package com.example.demo.dto;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
public class CommentDTO {

    private Long id;
    @NotEmpty
    private String username;
    private String message;
}
