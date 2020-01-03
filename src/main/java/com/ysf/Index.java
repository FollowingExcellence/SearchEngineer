package com.ysf;

import java.io.IOException;

/**
 * 索引应该实现的功能模板
 */
public interface Index {

    //建立索引
    public void build();

    //从文件加载倒排索引
    public void read(String fileName) throws IOException;

    //把内存中建好的倒排索引存入文件
    public void flush(String fileName) throws IOException;
}
