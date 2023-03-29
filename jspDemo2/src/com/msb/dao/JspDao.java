package com.msb.dao;

import com.msb.pojo.Emp;
import javafx.scene.chart.PieChart;
import javafx.scene.input.DataFormat;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class JspDao {

    //模拟查询数据库了把
    public List<Emp> findEmps() throws ParseException {
        //创建list集合
        List list =new ArrayList();
        //创建emp对象
        DateFormat dateFormat1 = new SimpleDateFormat("yyyy-MM-dd");
        
        Emp emp1 =new Emp(1,"张三","001",1, dateFormat1.parse("2009-1-1"),1000.1,100.1,1);
        Emp emp2 =new Emp(2,"李四","002",2, dateFormat1.parse("2009-2-2"),2000.1,200.1,2);
        Emp emp3 =new Emp(3,"王五","003",3, dateFormat1.parse("2009-3-3"),3000.1,300.1,3);
        Emp emp4 =new Emp(4,"赵六","004",4, dateFormat1.parse("2009-4-4"),4000.1,400.1,4);
        Emp emp5 =new Emp(5,"田七","005",5, dateFormat1.parse("2009-5-5"),5000.1,500.1,5);
        Emp emp6 =new Emp(6,"小明","006",6, dateFormat1.parse("2009-6-6"),6000.1,600.1,6);
        Emp emp7 =new Emp(7,"小红","007",7, dateFormat1.parse("2009-7-7"),7000.1,700.1,7);
        Emp emp8 =new Emp(8,"小兰","008",8, dateFormat1.parse("2009-8-8"),8000.1,800.1,8);
        //将emp对象加入到list集合中
        Collections.addAll(list,emp1 ,emp2 ,emp3 ,emp4 ,emp5 ,emp6 ,emp7 ,emp8);
        //返回list
        return list;
    }
}
