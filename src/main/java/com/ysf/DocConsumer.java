package com.ysf;

import java.util.HashMap;

//正排索引
public class DocConsumer {

    public int docid; //文档编号
    //词到频率的映射，频率存在长度是1的整数数组中
    HashMap<String, int[]> frequencyList;
    int words;   //文档长度，也就是这个文档包含多少个词

}

