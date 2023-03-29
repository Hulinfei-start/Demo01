package com.msb.dao.impl;

import com.msb.dao.AreaDao;
import com.msb.dao.BaseDao;
import com.msb.pojo.Area;

import java.util.List;

//操作area的实现类
public class AreaDaoImpl extends BaseDao implements AreaDao{


    @Override
    public List<Area> findAll(int sercletID) {
        //此处调取数据库获取相关的数据
        //编写sql
        String sql ="select * from area where parentid = ?";
        //调用方法
        List list = baseQuery(Area.class, sql, sercletID);
        //返回service层
        return list;
    }
}
