package com.example.apicommon.service;

import com.example.apicommon.model.entity.InterfaceInfo;

/**
* @author 奋青灬
* @description 针对表【interface_info(接口信息)】的数据库操作Service
* @createDate 2023-08-02 17:28:19
*/
public interface InnerInterfaceInfoService {

    /**
     * 从数据库中查询模拟接口是否存在(请求路径、请求方法、请求参数)
     * @param url
     * @param method
     * @return
     */
    InterfaceInfo getInterfaceInfo(String url, String method);
}
