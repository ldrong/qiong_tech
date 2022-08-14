package com.tencent.wxcloudrun.controller;

import com.tencent.wxcloudrun.config.ApiResponse;
import com.tencent.wxcloudrun.dto.LotteryResultRequest;
import com.tencent.wxcloudrun.model.LotteryResult;
import com.tencent.wxcloudrun.service.LotteryResultService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class LotteryResultController {
    final LotteryResultService lotteryResultService;
    final Logger logger;

    public LotteryResultController(@Autowired LotteryResultService lotteryResultService) {
        this.lotteryResultService = lotteryResultService;
        this.logger = LoggerFactory.getLogger(LotteryResultController.class);
    }

    @PostMapping(value="/api/lty_result")
    ApiResponse getResult(@RequestBody LotteryResultRequest request){
        logger.info("/api/count post request, lotteryId: {}, lotteryNo: {}", request.toString());
        String lotteryId = request.getLotteryId();
        long lotteryNo = request.getLotteryNo();
        Optional<LotteryResult> lotteryResult;
        if (lotteryNo == 0){
            lotteryResult = lotteryResultService.getLotteryResult(lotteryId);
        } else {
            lotteryResult = lotteryResultService.getLotteryResult(lotteryId, lotteryNo);
        }

        return ApiResponse.ok(lotteryResult);
    }
}
