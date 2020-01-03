package com.ysf;

import java.io.Serializable;

/**
 *  倒排索引
 */
public class Posting implements Serializable {

    public int docid;   //文档编号
    public int freq;    //这个词在文档中出现多少次

    Posting(int doc, int freq) {
        this.docid = doc;
        this.freq = freq;
    }
}
