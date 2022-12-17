package com.mbh;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.mbh.dao.StudentDao;
import com.mbh.domain.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Mybatisplus01ApplicationTests {

    @Autowired
    private StudentDao studentDao;
    @Test
    void testsave(){
        Student student = new Student();
        student.setId(7);
        student.setName("zhaoqi");
        student.setAge(89);
        student.setAddress("新疆");
        studentDao.insert(student);
    }
//    @Test
//    void testGetByPage(){
//        IPage page = new IPage(1,2);
//        studentDao.selectPage(page,null);
//
//    }
    @Test
    void contextLoads() {
        System.out.println(studentDao.selectList(null));
    }

}
