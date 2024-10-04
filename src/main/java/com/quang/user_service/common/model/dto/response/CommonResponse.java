package com.quang.user_service.common.model.dto.response;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CommonResponse {

    private int code;

    private String message;

    private Object data;

}