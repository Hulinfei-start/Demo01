package com.msb.service;

import com.msb.pojo.Emp;

import java.text.ParseException;
import java.util.List;

public interface JspService<list> {

    //调用dao获取数据
    List<Emp> findEmps() throws ParseException;
}
