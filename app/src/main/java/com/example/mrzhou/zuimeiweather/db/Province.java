package com.example.mrzhou.zuimeiweather.db;

/**
 * Created by Mr.zhou on 2017/12/25.
 */

import org.litepal.crud.DataSupport;

public class Province extends DataSupport {

    private int id;

    private String provinceName;
    //记录省的名字
    private int provinceCode;
    //记录省代码

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}