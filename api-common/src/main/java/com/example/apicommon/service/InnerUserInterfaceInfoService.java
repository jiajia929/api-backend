package com.example.apicommon.service;

import com.example.apicommon.model.entity.UserInterfaceInfo;

/**
* @author 奋青灬
* @description 针对表【user_interface_info(用户调用接口关系)】的数据库操作Service
* @createDate 2023-08-03 22:41:28
*/
public interface InnerUserInterfaceInfoService {
    /**
     * 调用接口统计
     * @param interfaceInfoId
     * @param userId
     * @return
     */
    boolean invokeCount(long interfaceInfoId, long userId);
}
