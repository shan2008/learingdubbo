package com.alibaba.dubbo.demo.provider.injecttest;

/**
 * @Author: syou
 * @Date: 2021/4/2 16:41
 */

public class HighStudent implements Student {

    public IAddress getJaddress() {
        return jaddress;
    }

    private IAddress jaddress;

    public void setJaddress(IAddress jaddress) {
        this.jaddress = jaddress;
    }
}
