package com.tencent.wxcloudrun.dao;

import com.tencent.wxcloudrun.model.LotteryResult;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface LotteryResultMapper {
    public LotteryResult getLotteryResult(@Param("lotteryId") String lotteryId, @Param("lotteryNo") long lotteryNo);
    public LotteryResult getLotteryResult(@Param("lotteryId") String lotteryId);
}
