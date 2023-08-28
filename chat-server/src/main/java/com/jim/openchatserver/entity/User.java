package com.jim.openchatserver.entity;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;


/**
 * @author jim
 */
@Entity
@Getter
@Setter
public class User extends BaseEntity {

    /**
     * 用户名，用于登录和显示。应该具有唯一性限制。
     */
    private String username;

    /**
     * 用户的电子邮件地址，用于与用户进行通信。
     */
    private String email;

    /**
     * 用户密码，应当使用加密方式存储。
     */
    private String password;

    /**
     * 用户的名字。
     */
    private String firstName;

    /**
     * 用户的姓氏。
     */
    private String lastName;

    /**
     * 用户的出生日期。
     */
    private LocalDate dateOfBirth;

    /**
     * 用户的性别，通常是一个枚举值（如男、女、其他）。
     */
    private Gender gender;

    /**
     * 用户的电话号码。
     */
    private String phoneNumber;

    /**
     * 用户的地址信息。
     */
    private String address;

    /**
     * 用户的头像图片路径或URL。
     */
    private String profilePicture;

    /**
     * 表示用户是否处于活跃状态的标志。
     */
    private boolean isActive;

    /**
     * 用户账号创建日期。
     */
    private LocalDateTime creationDate;

    /**
     * 用户最后一次登录的日期和时间。
     */
    private LocalDateTime lastLoginDate;

}
