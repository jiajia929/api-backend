package com.api.project.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.apicommon.model.entity.UserInterfaceInfo;
import com.api.project.model.dto.userinterfaceinfo.UpdateUserInterfaceInfoDTO;

public interface UserInterfaceInfoService extends IService<UserInterfaceInfo> {
    void validUserInterfaceInfo(UserInterfaceInfo userInterfaceInfo, boolean add);

    /**
     * 调用接口统计
     * @param interfaceInfoId
     * @param userId
     * @return
     */
    boolean invokeCount(long interfaceInfoId, long userId);

    /**
     *更新用户接口信息
     * @param updateUserInterfaceInfoDTO
     * @return
     */
    boolean updateUserInterfaceInfo(UpdateUserInterfaceInfoDTO updateUserInterfaceInfoDTO);

}
