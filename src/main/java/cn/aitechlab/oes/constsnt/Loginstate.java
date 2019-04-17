package cn.aitechlab.oes.constsnt;

/**
 * @Description: 作用描述
 * @Author: PPQiu
 * @CreateDate: 2019/4/15 19:18
 */
public class Loginstate {
    int responsecode;
    String info;

    public Loginstate(int responsecode, String info) {
        this.responsecode = responsecode;
        this.info = info;
    }

    public int getResponsecode() {
        return responsecode;
    }

    public void setResponsecode(int responsecode) {
        this.responsecode = responsecode;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
