package top.srcrs.bilibili.domain;

/**
 * 项目的配置类。
 * @author srcrs
 * @Time 2020-10-13
 */
public class Config {
    private static final Config CONFIG = new Config();
    /** 代表所需要投币的数量 */
    static private Integer coin;
    /** 送出即将过期的礼物 true 默认送出*/
    static private boolean gift;
    /** 要将银瓜子转换成硬币 true 默认转换*/
    static private boolean s2c;

    public static Config getInstance(){
        return CONFIG;
    }
    private Config(){}

    public Integer getCoin() {
        return coin;
    }

    public void setCoin(Integer coin) {
        this.coin = coin;
    }

    public boolean isGift() {
        return gift;
    }

    public void setGift(boolean gift) {
        this.gift = gift;
    }

    public boolean isS2c() {
        return s2c;
    }

    public void setS2c(boolean s2c) {
        this.s2c = s2c;
    }

    @Override
    public String toString() {
        return "Config{" +
                "coin=" + coin +
                ", gift=" + gift +
                ", s2c=" + s2c +
                '}';
    }
}
