package com.mbh;

import com.mbh.dao.BookDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Springboot04ApplicationTests {

    @Autowired
    private BookDao bookDao;
    @Test
    void  testGetById() {
        System.out.println(bookDao.getById(1));
    }

}
