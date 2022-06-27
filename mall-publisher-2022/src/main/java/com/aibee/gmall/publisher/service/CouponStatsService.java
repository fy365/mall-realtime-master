package com.aibee.gmall.publisher.service;

import com.aibee.gmall.publisher.bean.CouponReduceStats;

import java.util.List;

public interface CouponStatsService {
    List<CouponReduceStats> getCouponStats(Integer date);
}
