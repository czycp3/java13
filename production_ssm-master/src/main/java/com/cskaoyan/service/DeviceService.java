package com.cskaoyan.service;

import com.cskaoyan.bean.Department;
import com.cskaoyan.bean.Device;
import com.cskaoyan.bean.QueryStatus;

import java.util.List;

/**
 * @Author: zero
 * @Date: 2019/5/17 15:09
 * @Version 1.0
 */
public interface DeviceService {
    List<Device> queryDeviceList(int rows,int page);

    List<Device> queryDeviceByDeviceId(String searchValue, int rows, int page);

    List<Device> queryDeviceByDeviceName(String searchValue,int rows,int page);

    List<Device> queryDeviceByDeviceTypeName(String searchValue,int rows,int page);

    QueryStatus insertDevice(Device device);

    QueryStatus updateDevice(Device device);

    QueryStatus deleteDeviceByIds(String[] ids);

    List<Device> getDeviceList();

    Device selectDeviceById(String deviceId);
}
