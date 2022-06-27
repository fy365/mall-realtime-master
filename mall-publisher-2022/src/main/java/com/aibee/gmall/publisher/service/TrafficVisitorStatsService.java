package com.aibee.gmall.publisher.service;

import com.aibee.gmall.publisher.bean.TrafficVisitorStatsPerHour;
import com.aibee.gmall.publisher.bean.TrafficVisitorTypeStats;

import java.util.List;

public interface TrafficVisitorStatsService {
    List<TrafficVisitorTypeStats> getVisitorTypeStats(Integer date);

    List<TrafficVisitorStatsPerHour> getVisitorPerHrStats(Integer date);
}
