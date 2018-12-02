package com.pingan.springbootdemo.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDto implements Serializable {

    private static final long serialVersionUID = -4234574846270385305L;

    private Long id;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date birthday;

}
