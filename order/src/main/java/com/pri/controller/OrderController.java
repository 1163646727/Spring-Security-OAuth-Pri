package com.pri.controller;

import com.pri.dto.UserDTO;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * className: OrderController <BR>
 * description: order资源<BR>
 * remark: <BR>
 * author: ChenQi <BR>
 * createDate: 2020-07-05 14:38 <BR>
 */
@RestController
public class OrderController {

    @GetMapping(value = "/r1")
    @PreAuthorize("hasAuthority('p1')")//拥有p1权限方可访问此url
    public String r1(){
        //获取用户身份信息
        UserDTO  userDTO = (UserDTO) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        return "".equals (userDTO.getFullname()) ? "匿名" : userDTO.getFullname()+"访问资源1";
    }

}