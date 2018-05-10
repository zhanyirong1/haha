package com.demo.weixin.dao;

import com.demo.weixin.entity.Area;

import java.util.List;


public interface AreaDao {

    List<Area> queryArea();

    Area queryAreaById(int areaId);

    /**
     * 插入一个区域信息
     *
     * @param area 区域
     * @return
     */
    int insertArea(Area area);

    /**
     * 更新区域信息
     *
     * @param area
     * @return
     */
    int updateArea(Area area);

    /**
     * 删除某一个区域信息
     *
     * @param id
     * @return
     */
    int deleteAreaById(Integer id);

}
