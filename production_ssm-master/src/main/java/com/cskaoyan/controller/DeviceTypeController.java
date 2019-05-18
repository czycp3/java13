package com.cskaoyan.controller;

import com.cskaoyan.bean.BaseResultVo;
import com.cskaoyan.bean.DeviceType;
import com.cskaoyan.service.DeviceTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Author: zero
 * @Date: 2019/5/18 16:37
 * @Version 1.0
 */
@Controller
public class DeviceTypeController {
    @Autowired
    DeviceTypeService deviceTypeService;
    //新建提交的json对象
    BaseResultVo baseResultVo=new BaseResultVo();

    @RequestMapping("/device/deviceType")
    public String getJsp(){
        return "deviceType";
    }
    @RequestMapping("/deviceType/list")
    @ResponseBody
    public BaseResultVo queryDeviceTypeList(){
        List<DeviceType> deviceTypeList = deviceTypeService.getDeviceTypeList();
        baseResultVo.setTotal(deviceTypeList.size());
        baseResultVo.setRows(deviceTypeList);
        return baseResultVo;
    }
}
