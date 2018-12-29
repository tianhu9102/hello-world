package cn.th.jump.demoboot.service;

import cn.th.jump.demoboot.bean.Student;
import cn.th.jump.demoboot.dao.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service(value = "student_Service")
public class StudentService {
    @Autowired
    StudentDao studentDao;

    /**
     *
     * @return
     */
    public List<Student> queryAll(){
        return studentDao.queryAll();
    }

    public int addStudent(Student student){
        return studentDao.addStudent(student);
    }

}
