package com.api.project.model.dto.user;

import lombok.Data;

import java.io.Serializable;

/**
 * 邮箱验证请求体
 */
@Data
public class UserEmailRequest implements Serializable {

    private static final long serialVersionUID = 3191241716789120793L;
    private String email;
}
