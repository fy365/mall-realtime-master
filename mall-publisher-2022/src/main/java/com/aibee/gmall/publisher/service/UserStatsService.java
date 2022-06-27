package com.aibee.gmall.publisher.service;

import com.aibee.gmall.publisher.bean.UserChangeCtPerType;
import com.aibee.gmall.publisher.bean.UserPageCt;
import com.aibee.gmall.publisher.bean.UserTradeCt;

import java.util.List;

public interface UserStatsService {
    List<UserPageCt> getUvByPage(Integer date);

    List<UserChangeCtPerType> getUserChangeCt(Integer date);

    List<UserTradeCt> getTradeUserCt(Integer date);
}
