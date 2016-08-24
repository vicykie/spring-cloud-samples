package org.vicykie.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.vicykie.entities.User;
import org.vicykie.service.UserService;

import java.util.List;

/**
 * Created by 李朝衡 on 2016/8/20.
 */
@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    UserService userService;
    @RequestMapping(value = "",method = RequestMethod.GET)
    public List<User> getList(){
        return userService.getAll();
    }
}
