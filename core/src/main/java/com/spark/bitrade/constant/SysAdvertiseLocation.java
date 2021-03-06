package com.spark.bitrade.constant;

import com.fasterxml.jackson.annotation.JsonValue;
import com.spark.bitrade.core.BaseEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * @author rongyu
 * @description 系统广告位置
 * @date 2018/1/6 15:59
 */
@AllArgsConstructor
@Getter
public enum SysAdvertiseLocation implements BaseEnum {
    //app 首页轮播
    APP_SHUFFLING("app首页轮播"),
    //pc 首页轮播
    PC_SHUFFLING("pc首页轮播"),
    //pc 分类广告
    PC_CLASSIFICATION("pc分类广告");
    @Setter
    private String cnName;
    @Override
    @JsonValue
    public int getOrdinal() {
        return ordinal();
    }

}
