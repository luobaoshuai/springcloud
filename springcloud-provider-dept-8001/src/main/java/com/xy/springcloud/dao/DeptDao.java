package com.xy.springcloud.dao;

import com.xy.springcloud.pojo.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Mapper
@Repository
public interface DeptDao {

    public boolean addDept(@RequestBody Dept dept);

    public Dept queryById(Long id);

    public List<Dept> queryAll();
}
