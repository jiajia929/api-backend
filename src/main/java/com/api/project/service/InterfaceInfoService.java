package com.api.project.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.apicommon.model.entity.InterfaceInfo;

/**
* @author 奋青灬
* @description 针对表【interface_info(接口信息)】的数据库操作Service
* @createDate 2023-08-02 17:28:19
*/
public interface InterfaceInfoService extends IService<InterfaceInfo> {

    void validInterfaceInfo(InterfaceInfo interfaceInfo, boolean add);
}
