package com.mbh.dao;

import com.mbh.domain.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface BookDao {

    @Select("select * from test3 where id = #{id}")
     Book getById(Integer id);

}
