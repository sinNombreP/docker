package com.wmzr.docker.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @author 彭善智
 * @Title: demoCollltor
 * @ProjectName docker
 * @Description: TODO
 * @date 2019/6/323:16
 */
@RestController
public class demoCollltor {

    @RequestMapping("hello1")
    public Date hello(){
        return  new Date();
    }

}
