package com.aibee.gmall.publisher.service;

import com.aibee.gmall.publisher.bean.TradeProvinceOrderAmount;
import com.aibee.gmall.publisher.bean.TradeProvinceOrderCt;
import com.aibee.gmall.publisher.bean.TradeStats;

import java.util.List;

public interface TradeStatsService {
    Double getTotalAmount(Integer date);

    List<TradeStats> getTradeStats(Integer date);

    List<TradeProvinceOrderCt> getTradeProvinceOrderCt(Integer date);

    List<TradeProvinceOrderAmount> getTradeProvinceOrderAmount(Integer date);
}
