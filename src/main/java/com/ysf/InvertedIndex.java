package com.ysf;

import java.util.*;

public class InvertedIndex {

    //词和这个词在文档中出现的位置信息
    Map<String, List<Tuple>> index = new HashMap<String,List<Tuple>>();

    //索引文档
    public void indexDoc(String docName, ArrayList<String> words) {
        int pos = 0;
        for (String word : words) {
            pos++; //位置
            List<Tuple> idx = index.get(word);
            if (idx == null){
                idx = new LinkedList<Tuple>();
                index.put(word,idx);
            }
            idx.add(new Tuple(docName,pos));
            System.out.println("indexec" + docName  + ":" + pos +" words");
        }
    }

    //搜索
    public void search(List<String> words){
        for(String word : words){
            Set<String> answer = new HashSet<String>();
            List<Tuple> idx = index.get(word);
            if(idx != null){
                for(Tuple t : idx) {  //找到了一些文档
                    answer.add(t.docName);
                }
            }
            System.out.println(word);
            for (String f : answer) {
                System.out.print(" " + f); //输出文件名
            }
            System.out.println("");
        }
    }

    private class Tuple {  //<文档名，位置>元组
        private String docName; //文档名
        private int position;   //位置

        public Tuple(String d,int position){
            this.docName = d;
            this.position = position;
        }
    }
}
