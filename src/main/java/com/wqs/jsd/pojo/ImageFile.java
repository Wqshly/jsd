package com.wqs.jsd.pojo;

import java.io.Serializable;

/**
 * @Author:
 * @Date: Created in 20:07 2020/3/11
 * @Description:
 * @Modified By:
 */
public class ImageFile implements Serializable {
    private String name;
    private String file;
    private static final long serialVersionUID = 1L;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }
}
