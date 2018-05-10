package com.demo.weixin.web;

import com.demo.weixin.entity.Area;
import com.demo.weixin.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/superadmin")
public class AreaController {
    @Autowired
    private AreaService areaService;

    @RequestMapping(value = "/listarea",method = RequestMethod.GET)
    private Map<String,Object> listArea(){
        Map<String,Object> model = new HashMap<>();
        List<Area> area= areaService.queryArea();
        model.put("areaList",area);
        return model;
    }

    @GetMapping("/getarea")
    public Map<String, Object> getAreaByAreaId(Integer areaId){
        Map<String, Object> modelMap = new HashMap<>();
        Area area = areaService.getAreaByAreaId(areaId);

        modelMap.put("area", area);

        return modelMap;
    }

    @PostMapping("/addarea")
    public Map<String, Object> addArea(@RequestBody Area area){
        Map<String, Object> modelMap = new HashMap<>();
        modelMap.put("success", areaService.addArea(area));

        return modelMap;
    }

    @PostMapping("/modifyarea")
    public Map<String, Object> modifyArea(@RequestBody Area area){
        Map<String, Object> modelMap = new HashMap<>();

        modelMap.put("success", areaService.modifyArea(area));

        return modelMap;
    }

    @GetMapping("/delarea")
    public Map<String, Object> deleteArea(Integer areaId){
        System.out.println(areaId);
        Map<String, Object> modelMap = new HashMap<>();

        modelMap.put("success", areaService.deleteArea(areaId));

        return modelMap;
    }

}
