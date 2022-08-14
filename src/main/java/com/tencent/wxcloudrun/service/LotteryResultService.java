package com.tencent.wxcloudrun.service;

import com.tencent.wxcloudrun.model.LotteryResult;

import java.util.Optional;

public interface LotteryResultService {
    Optional<LotteryResult> getLotteryResult(String lotteryId, long lotteryNo);
    Optional<LotteryResult> getLotteryResult(String lotteryId);
}
