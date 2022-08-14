package com.tencent.wxcloudrun.dto;

import lombok.Data;

@Data
public class LotteryResultRequest {

    private String lotteryId;
    private long lotteryNo;

    public long getLotteryNo() {
        return lotteryNo;
    }

    public void setLotteryNo(long lotteryNo) {
        this.lotteryNo = lotteryNo;
    }

    public String getLotteryId() {
        return lotteryId;
    }

    public void setLotteryId(String lotteryId) {
        this.lotteryId = lotteryId;
    }
}
