package pingwit.homework_25_task.dto;

import java.util.List;

public class UserDto {
    private Long id;
    private String login;
    private String password;
    private AvatarDto avatar;
    private List<SubscriptionDto> subscriptions;
    private List<CommentDto> comments;
}

