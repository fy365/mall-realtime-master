package com.aibee.gmallpublisher.mapper;

import org.apache.ibatis.annotations.Select;

public interface GmvMapper {

    //查询ClickHouse,获取GMV总数
    @Select("select sum(order_amount) from dws_trade_province_order_window where toYYYYMMDD(stt)=#{date}")
    Double selectGmv(int date);

}
