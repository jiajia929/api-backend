package com.api.project.model.vo;

import com.example.apicommon.model.entity.InterfaceInfo;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 接口分析封装视图
 *
 * @author yupi
 * @TableName product
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class InterfaceInfoVO extends InterfaceInfo {

    /**
     * 调用次数
     */
    private Integer totalNum;

    /**
     * 接口剩余可调用次数
     */
    private String availablePieces;

    private static final long serialVersionUID = 1L;
}