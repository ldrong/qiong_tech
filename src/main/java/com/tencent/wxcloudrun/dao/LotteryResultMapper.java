package com.tencent.wxcloudrun.dao;

import com.tencent.wxcloudrun.model.LotteryResult;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LotteryResultMapper {
    public LotteryResult getLotteryResult(String lotteryId, long lotteryNo);
    public LotteryResult getLotteryResult(String lotteryId);
}
