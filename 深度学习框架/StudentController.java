package cn.th.jump.demoboot.controller;

import cn.th.jump.demoboot.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import cn.th.jump.demoboot.bean.Student;

import javax.annotation.Resource;
import java.util.*;

@Controller
@RequestMapping(value="user")
public class StudentController {

    @Resource(name = "student_Service")
    StudentService studentService;

    @RequestMapping(value="/restful",method = RequestMethod.GET)
    @ResponseBody
    public List<Student> getUserList(){
        List<Student> lst = studentService.queryAll();
        return lst;
    }

    @RequestMapping(value = "/restful",method = RequestMethod.POST)
    @ResponseBody
     public int addStudent(Student student){
        return  studentService.addStudent(student);
    }


}
