package com.fineshop.entity;

import java.io.Serializable;

/**
 * Created by acer on 2017-4-27.
 */
public class Pages implements Serializable{

    public static final int DEFAULT_NUM = 1;
    public static final int DEFAULT_SIZE = 20;

    private int pageNum = DEFAULT_NUM;
    private int pageSize = DEFAULT_SIZE;
    private boolean isCount;

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public boolean getIsCount() {
        return isCount;
    }

    public void setIsCount(boolean isCount) {
        this.isCount = isCount;
    }

}
