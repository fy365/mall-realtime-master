package com.aibee.gmall.publisher.service.impl;

import com.aibee.gmall.publisher.bean.CouponReduceStats;
import com.aibee.gmall.publisher.mapper.CouponStatsMapper;
import com.aibee.gmall.publisher.service.CouponStatsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CouponStatsServiceImpl implements CouponStatsService {

    @Autowired
    private CouponStatsMapper couponStatsMapper;

    @Override
    public List<CouponReduceStats> getCouponStats(Integer date) {
        return couponStatsMapper.selectCouponStats(date);
    }
}
