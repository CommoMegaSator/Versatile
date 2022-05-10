package com.versatile.domain.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
@AllArgsConstructor
@Builder
@Schema(description = "Основна сутність користувача")
public class UserDTO implements Serializable {
    @Schema(description = "Ідентифікатор")
    private Long id;

    @NotNull(message = "Field 'email' can not be NULL")
    @Email
    @Size(min = 4, max = 25)
    @Schema(description = "Електронна пошта")
    private String email;

    @Size(min = 4, max = 25)
    @Schema(description = "Ім'я")
    private String firstname;

    @Size(min = 4, max = 25)
    @Schema(description = "Прізвище")
    private String lastname;

    @NotNull(message = "Field 'nickname' can not be NULL")
    @Size(min = 4, max = 25)
    @Schema(description = "Псевдонім")
    private String nickname;

    @Schema(description = "Вік")
    private Integer age;

    @NotNull(message = "Field 'password' can not be NULL")
    @Size(min = 8, max = 25)
    @Schema(description = "Пароль")
    private String password;

    @Schema(description = "Дата створення акаунта")
    private Date creationDate;

    @Schema(description = "День народження")
    private Date birthday;

    @Schema(description = "Стать")
    private String gender;

    @Schema(description = "Національність")
    private String nationality;

    @Schema(description = "Місто проживання")
    private String city;

    @Schema(description = "Про користувача")
    private String aboutUser;

    @Schema(description = "Стан акаунта")
    private boolean status;
}