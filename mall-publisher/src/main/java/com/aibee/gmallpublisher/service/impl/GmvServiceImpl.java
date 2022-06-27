package com.aibee.gmallpublisher.service.impl;

import com.aibee.gmallpublisher.mapper.GmvMapper;
import com.aibee.gmallpublisher.service.GmvService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GmvServiceImpl implements GmvService {

    @Autowired
    private GmvMapper gmvMapper;

    @Override
    public Double getGmv(int date) {
        return gmvMapper.selectGmv(date);
    }
}
