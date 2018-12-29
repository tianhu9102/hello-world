package cn.th.jump.demoboot.dao;

import cn.th.jump.demoboot.bean.Student;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

//@Mapper
@Repository
public interface StudentDao {

    @Select("select *  from student")
    @ResultType(Student.class)
    List<Student> queryAll();

    @Insert("insert into student(name,age,nation) values (#{name},#{age},#{nation})")
    @ResultType(Student.class)
    int addStudent(Student student);

}
