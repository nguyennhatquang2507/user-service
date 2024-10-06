package com.quang.user_service.user.model.dto;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UserRequest {

    private String username;

    private String password;

    private String name;

}
