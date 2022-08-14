package com.tencent.wxcloudrun.service.impl;

import com.tencent.wxcloudrun.dao.LotteryResultMapper;
import com.tencent.wxcloudrun.model.LotteryResult;
import com.tencent.wxcloudrun.service.LotteryResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LotteryResultServiceImpl implements LotteryResultService {

    final LotteryResultMapper lotteryResultMapper;

    public LotteryResultServiceImpl(@Autowired LotteryResultMapper lotteryResultMapper) {
        this.lotteryResultMapper = lotteryResultMapper;
    }

    @Override
    public Optional<LotteryResult> getLotteryResult(String lotteryId, long lotteryNo) {
        return Optional.ofNullable(lotteryResultMapper.getLotteryResult(lotteryId,lotteryNo));
    }

    @Override
    public Optional<LotteryResult> getLotteryResult(String lotteryId) {
        return Optional.ofNullable(lotteryResultMapper.getLotteryResult(lotteryId));
    }
}
