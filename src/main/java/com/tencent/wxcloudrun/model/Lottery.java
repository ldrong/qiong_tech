package com.tencent.wxcloudrun.model;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Lottery {
    private String id;
    private String name;
    private long typeId;
    private String remarks;
    private LocalDateTime gmtCreateTime;
    private LocalDateTime gmtUpdateTime;
}
