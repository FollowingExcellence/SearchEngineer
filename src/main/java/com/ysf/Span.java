package com.ysf;

//统计相关度
public class Span {

    public int start;  //开始位置
    public int end;    //结束位置

    public Span(int s, int e){
        start = s;
        end = e;
    }

    public int length() {
        return end - start;
    }

    public String toString(){
        return start + "-" + end;
    }
}
