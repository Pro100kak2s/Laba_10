package com.company;
import java.util.ArrayList;
public class ex1 {
    public static class conversion<E>{
        private ArrayList<E> lst=new ArrayList<>();
        public conversion(E[]array){
            for(E i:array){
                lst.add(i);
            }
        }
        public void showList(){
            for(E i:lst){
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String[] args){
        String []array={"a","b"};
        Integer []arrayInt={1,2};
        conversion<Integer> c=new conversion<Integer>(arrayInt);
        c.showList();
        System.out.println();
        conversion<String> b=new conversion<String>(array);
        b.showList();
    }
}
