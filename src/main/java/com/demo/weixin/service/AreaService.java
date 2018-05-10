package com.demo.weixin.service;

import com.demo.weixin.entity.Area;

import java.util.List;

public interface AreaService {

    List<Area> queryArea();

    Area getAreaByAreaId(int areaId);



    /**
     * 添加一个区域
     *
     * @param area
     * @return
     */
    boolean addArea(Area area);

    /**
     * 更新区域信息
     *
     * @param area
     * @return
     */
    boolean modifyArea(Area area);

    /**
     * 根据areaId 删除区域信息
     *
     * @param areaId
     * @return
     */
    boolean deleteArea(Integer areaId);

}
