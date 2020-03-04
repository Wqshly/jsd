package com.wqs.jsd.pojo;

import java.io.Serializable;
import java.util.List;

/**
 * @Author: wan
 * @Date: Created in 20:28 2020/3/3
 * @Description:
 * @Modified By:
 */
public class PageInfo implements Serializable {
    private String type;
    private Page page;
    private Sort sort;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Page getPage() {
        return page;
    }

    public void setPage(Page page) {
        this.page = page;
    }

    public Sort getSort() {
        return sort;
    }

    public void setSort(Sort sort) {
        this.sort = sort;
    }
}
