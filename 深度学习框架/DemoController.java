package cn.th.jump.demoboot.controller;

import cn.th.jump.demoboot.bean.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//@RestController
@Controller
public class DemoController {

    /* 返回参数0：jsp/html  */
    @RequestMapping(path = {"/test"} )
    public ModelAndView test(){

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/test");

        List<Student> lstUsers = new ArrayList<Student>();
        Student user = new Student();
        user.setName("TOM-k");
        user.setAge(22);
        Student user1 = new Student();
        user1.setName("JIM-l");
        user1.setAge(25);

        lstUsers.add(user);
        lstUsers.add(user1);

        modelAndView.addObject("users",lstUsers);
        return modelAndView;
    }

    /*  返回参数1：列表  */
    @RequestMapping(path = {"/findStudents"} )
    @ResponseBody
    public List<Student> findUsers(){

        List<Student> lstUsers = new ArrayList<Student>();
        Student user = new Student();
        user.setName("TOM");
        user.setAge(22);
        Student user1 = new Student();
        user1.setName("JIM");
        user1.setAge(25);

        lstUsers.add(user);
        lstUsers.add(user1);

        return lstUsers;
    }

    /*  返回参数2：实体类  */
    /*  入参1：@PathVariable  */
    @RequestMapping(path = {"/findStudent/{id}"} )
    @ResponseBody
    public Student findUserById(@PathVariable("id") int userId){

        Student user = new Student();
        user.setName("TOMM");
        user.setAge(23);
        user.setId(Long.valueOf(userId) );
        return user;
    }

    /*  返回参数3：KEY-VALUE  */
    /*  入参2：@RequestParam  */
    @RequestMapping(path = {"/addStudent"} )
    @ResponseBody
    public Map<String, Student> addUser(@RequestParam(value="name") String name, @RequestParam(value="age") Integer age ){

        Map<String, Student> map = new HashMap<String, Student>();
        Student user = new Student();
        user.setName(name);
        user.setAge(age);
        map.put("user-key",user);

        return map;
    }

    @RequestMapping(path = {"/findStudent"}, method= RequestMethod.DELETE )
    public String  delete(@RequestParam(value="param1",required = false) int userId){

        System.out.println("delete:  "+userId);
        return "";
    }


}
