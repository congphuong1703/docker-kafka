package com.cmcglobal.resourcemanagement.app.responses.base;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class BaseResponse {

    private final Object data;
    private final Object message;
    private final Object statusCode;
    private final Object description;
}
