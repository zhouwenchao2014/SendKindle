package cn.zhou.myhomespace.po;

/**
 * Created by zhouwenchao on 2016/12/9.
 */
public class User {
    private String id;
    private String email;
    private int isSign;
    private int todaySendTimes;
    private String lastSendTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIsSign() {
        return isSign;
    }

    public void setIsSign(int isSign) {
        this.isSign = isSign;
    }

    public int getTodaySendTimes() {
        return todaySendTimes;
    }

    public void setTodaySendTimes(int todaySendTimes) {
        this.todaySendTimes = todaySendTimes;
    }

    public String getLastSendTime() {
        return lastSendTime;
    }

    public void setLastSendTime(String lastSendTime) {
        this.lastSendTime = lastSendTime;
    }
}
