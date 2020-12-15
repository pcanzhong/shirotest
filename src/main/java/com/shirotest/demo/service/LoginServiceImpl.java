package com.shirotest.demo.service;

import com.shirotest.demo.dao.RoleDao;
import com.shirotest.demo.dao.UserDao;
import com.shirotest.demo.vo.Permission;
import com.shirotest.demo.vo.Role;
import com.shirotest.demo.vo.User;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class LoginServiceImpl implements LoginService{
    @Autowired
    private UserDao userDao;
    @Autowired
    private RoleDao roleDao;


    /**
     * 添加用户
     * @param user
     * @return
     */
    @Override
    public User addUser(User user) {
        userDao.save(user);
        return user;
    }

    /**
     * 添加角色
     * @param role
     * @return
     */

    @Override
    public Role addRole(Role role) {
        User user = userDao.findByName(role.getUser().getName());
        role.setUser(user);
        Permission permission1 = new Permission();
        permission1.setPermission("create");
        permission1.setRole(role);
        Permission permission2 = new Permission();
        permission2.setPermission("update");
        permission2.setRole(role);
        List<Permission> permissions = new ArrayList<Permission>();
        permissions.add(permission1);
        permissions.add(permission2);
        role.setPermissions(permissions);
        roleDao.save(role);
        return role;
    }

    /**
     * 查询用户通过用户名
     * @param name
     * @return
     */
    @Override
    public User findByName(String name) {
        return userDao.findByName(name);
    }
}
