package com.msb.service.impl;

import com.msb.dao.AreaDao;
import com.msb.dao.impl.AreaDaoImpl;
import com.msb.pojo.Area;
import com.msb.service.AreaService;

import java.util.List;

public class AreaServiceImpl  implements AreaService {
    @Override
    public List<Area> findAll(int sercletID) {
        //此处处理业务逻辑..............
        //创建dao 从到中获取数据
        AreaDao areaDao =new AreaDaoImpl();
        List<Area> areas=areaDao.findAll(sercletID);
        //返回controller
        return areas;
    }
}
