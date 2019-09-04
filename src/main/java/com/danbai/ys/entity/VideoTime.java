package com.danbai.ys.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "video_time")
public class VideoTime {
    /**
     * 用户名
     */
    private String username;

    /**
     * 影视id
     */
    private String ysidname;

    /**
     * 观看时间
     */
    private Float time;

    /**
     * 观看更新时间
     */
    private Date gktime;

    /**
     * 获取用户名
     *
     * @return username - 用户名
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置用户名
     *
     * @param username 用户名
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取影视id
     *
     * @return ysidname - 影视id
     */
    public String getYsidname() {
        return ysidname;
    }

    /**
     * 设置影视id
     *
     * @param ysidname 影视id
     */
    public void setYsidname(String ysidname) {
        this.ysidname = ysidname;
    }

    /**
     * 获取观看时间
     *
     * @return time - 观看时间
     */
    public Float getTime() {
        return time;
    }

    /**
     * 设置观看时间
     *
     * @param time 观看时间
     */
    public void setTime(Float time) {
        this.time = time;
    }

    /**
     * 获取观看更新时间
     *
     * @return gktime - 观看更新时间
     */
    public Date getGktime() {
        return gktime;
    }

    /**
     * 设置观看更新时间
     *
     * @param gktime 观看更新时间
     */
    public void setGktime(Date gktime) {
        this.gktime = gktime;
    }
}