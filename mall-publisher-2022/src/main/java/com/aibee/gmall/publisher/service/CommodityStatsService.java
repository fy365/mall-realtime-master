package com.aibee.gmall.publisher.service;

import com.aibee.gmall.publisher.bean.CategoryCommodityStats;
import com.aibee.gmall.publisher.bean.SpuCommodityStats;
import com.aibee.gmall.publisher.bean.TrademarkCommodityStats;
import com.aibee.gmall.publisher.bean.TrademarkOrderAmountPieGraph;

import java.util.List;

public interface CommodityStatsService {
    List<TrademarkCommodityStats> getTrademarkCommodityStatsService(Integer date);

    List<CategoryCommodityStats> getCategoryStatsService(Integer date);

    List<SpuCommodityStats> getSpuCommodityStats(Integer date);

    List<TrademarkOrderAmountPieGraph> getTmOrderAmtPieGra(Integer date);
}
