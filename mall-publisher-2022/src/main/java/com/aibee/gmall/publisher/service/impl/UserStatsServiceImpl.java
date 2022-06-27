package com.aibee.gmall.publisher.service.impl;

import com.aibee.gmall.publisher.bean.UserChangeCtPerType;
import com.aibee.gmall.publisher.bean.UserPageCt;
import com.aibee.gmall.publisher.bean.UserTradeCt;
import com.aibee.gmall.publisher.mapper.UserStatsMapper;
import com.aibee.gmall.publisher.service.UserStatsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserStatsServiceImpl implements UserStatsService {

    @Autowired
    UserStatsMapper userStatsMapper;

    @Override
    public List<UserPageCt> getUvByPage(Integer date) {
        return userStatsMapper.selectUvByPage(date);
    }

    @Override
    public List<UserChangeCtPerType> getUserChangeCt(Integer date) {
        return userStatsMapper.selectUserChangeCtPerType(date);
    }

    @Override
    public List<UserTradeCt> getTradeUserCt(Integer date) {
        return userStatsMapper.selectTradeUserCt(date);
    }


}
