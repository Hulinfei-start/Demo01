package com.msb.service.impl;

import com.msb.dao.JspDao;
import com.msb.pojo.Emp;
import com.msb.service.JspService;

import java.text.ParseException;
import java.util.List;

public class JspServiceImpl implements JspService {

    //创建dao对象
   private JspDao dao= new JspDao();
    @Override
    public List<Emp> findEmps() throws ParseException {
        return dao.findEmps();
    }
}
