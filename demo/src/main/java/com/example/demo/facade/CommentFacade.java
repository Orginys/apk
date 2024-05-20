package com.example.demo.facade;


import com.example.demo.dto.CommentDTO;
import com.example.demo.entity.Comment;
import org.springframework.stereotype.Component;

@Component
public class CommentFacade  {

    public CommentDTO commentTOCommentDTO(Comment comment) {
        CommentDTO commentDTO = new CommentDTO();
        commentDTO.setId(commentDTO.getId());
        commentDTO.setUsername(comment.getUsername());
        commentDTO.setMessage(commentDTO.getMessage());

        return commentDTO;
    }
}
