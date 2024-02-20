package com.api.project.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.apicommon.model.entity.UserInterfaceInfo;
import java.util.List;

/**
* @author 奋青灬
* @description 针对表【user_interface_info(用户调用接口关系)】的数据库操作Mapper
* @createDate 2023-08-03 22:41:28
* @Entity com.yupi.project.model.entity.UserInterfaceInfo
*/
public interface UserInterfaceInfoMapper extends BaseMapper<UserInterfaceInfo> {

    List<UserInterfaceInfo> listTopInvokeInterfaceInfo(int limit);
}




