package com.ysf;

//用于分页读取索引文件
public class Page {
    public Page() {
        data = new byte[MAX_SPACE];
    }
    public Page(byte[] apage) {
        data = apage;
    }

    /**
     * 返回数据的字节数组
     * @return
     */
    public byte[] getPage(){
        return data;
    }

    byte[] data;
    public static final int MAX_SPACE = 100;

}
