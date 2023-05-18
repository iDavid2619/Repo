package com.david.springboot.controller;

import com.david.springboot.users.User;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @GetMapping("/11811914")
    public String hello() {
        return "Li Hengjie";
    }
}

//@RestController
//public class MyController {
//    //@ApiOperation("Designed by ID+name, it's a hello webpage")
//    //@ApiOperation(value="cs304 lab10",notes="just test")
//    @ApiOperation(value = "CS304 Lab10",
//                  notes = "paragraph")
//    @GetMapping(value = "/hello")
//    public String hello() {
//        return "helloCS304";
//    }
//
//    @ApiOperation("Tested by 11811914 David Li")
//    @PostMapping(value = "/user")
//    public User user() {
//        return new User();
//    }
//
//    @GetMapping(value = "/hello02")
//    public String hello02(
//            @ApiParam(name = "usernameTest",
//                      value = "uer test describe",
//                      required = true) String username) {
//        return "hello02 " + username;
//    }
//}
