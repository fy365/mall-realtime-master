package com.aibee.gmall.publisher.service;

import com.aibee.gmall.publisher.bean.ActivityReduceStats;

import java.util.List;

public interface ActivityReduceService {
    List<ActivityReduceStats> getActivityStats(Integer date);
}
