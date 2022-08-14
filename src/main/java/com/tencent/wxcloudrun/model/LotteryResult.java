package com.tencent.wxcloudrun.model;

import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
public class LotteryResult {
    private long id;
    private String lotteryId;
    private long lotteryNo;
    private String lotteryName;
    private String lotteryRes;
    private LocalDate lotteryDate;
    private LocalDate lotteryExDate;
    private String lotterySaleAmount;
    private String lotteryPoolAmount;
    private String lotteryPrize;
    private LocalDateTime gmtCreateTime;
    private LocalDateTime gmtUpdateTime;
}
