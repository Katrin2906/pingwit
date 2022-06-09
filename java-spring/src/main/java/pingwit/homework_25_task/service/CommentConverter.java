package pingwit.homework_25_task.service;

import org.springframework.stereotype.Component;
import pingwit.homework_25_task.dto.CommentDto;
import pingwit.homework_25_task.entity.Comment;

@Component
public class CommentConverter {

    public CommentDto toFront(Comment comment) {
        if (comment == null) {
            return null;
        }

        return new CommentDto(comment.getId(), comment.getText());
    }

    public Comment toLocal(CommentDto dto) {
        if (dto == null) {
            return null;
        }

        Comment comment = new Comment();
        comment.setId(dto.id());
        comment.setText(dto.text());

        return comment;
    }
}
