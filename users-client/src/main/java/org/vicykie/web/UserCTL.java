package org.vicykie.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.vicykie.entities.User;
import org.vicykie.service.UsersService;

import java.util.List;

/**
 * Created by 李朝衡 on 2016/8/22.
 */
@RestController
@RequestMapping("/test")
public class UserCTL {
    @Autowired
    private UsersService usersService;
    @RequestMapping("")
    public List<User> getUsers(){
       return usersService.getUsers();
    }
}
