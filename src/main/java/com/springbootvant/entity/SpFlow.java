package com.springbootvant.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

/**
 * 111
 *
 * @author LiuJiang
 * @date 2020/8/14 11:18
 */
@Entity
@Data
public class SpFlow {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private String name;
    private String xml;
    private String cron;
    private String enabled;
    private String createDate;
    private Date lastExecuteTime;
    private Date nextExecuteTime;
    private String executeCount;

}
