package com.david.springboot.users;

import io.swagger.annotations.*;

@ApiModel(value = "User Class",
          description = "CS304 Lab10 doc study by 11811914 David Li")
public class User {
    @ApiModelProperty(required = true,
                      example = "example: 11811914",
                      notes = "user's password")
    public String userName;
    @ApiModelProperty(required = (true),
                      example = "David Li",
                      notes = "user's name")
    public String password;
}
