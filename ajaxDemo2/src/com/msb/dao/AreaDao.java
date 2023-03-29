package com.msb.dao;

import com.msb.pojo.Area;

import java.util.List;

public interface AreaDao {
    List<Area> findAll(int sercletID);
}
