package com.xy.springcloud.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

//@Data ： 注在类上，提供类的get、set、equals、hashCode、toString等方法
//@AllArgsConstructor ：注在类上，提供类的全参构造
//@NoArgsConstructor ：注在类上，提供类的无参构造
//@Accessors(chain = true):链式写法:
//     Dept dept=new Dept();
//     dept.setDeptNo(11).setDname('ssss ').setDb_source('001 ');


@Data
@NoArgsConstructor
@Accessors(chain = true)
public class Dept implements Serializable {//Dept 实体类，orm 类表关系映射

    private Long deptno;//主键
    private String dname;

    //这个数据存在哪个数据库的字段-微服务，一个服务对于一个数据库，同一个信息可能存在不同数据库
    private String db_source;

    public Dept(String dname) {
        this.dname = dname;
    }
}
