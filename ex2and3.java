package com.company;

public class ex2and3 {
    /*Задание №2*/
    public static class anywayArray<E> {
        private E[] arr;
        public E getArrIndex(int i) {
            return arr[i];
        }
        public void setArr(E[] arr) {
            this.arr = arr;
        }
        public int getLength() {
            return arr.length;
        }
    }
    /*Задание №3*/
    public static <E> void getElement(E[] arr){
      anywayArray<E> ar=new anywayArray <E>();
      ar.setArr(arr);
      for(int i = 0; i<ar.getLength(); i++){
          System.out.print(ar.getArrIndex(i)+" ");
      }
    }
  public static void main(String[] args){
      String[] st={"a","b","c"};
      getElement(st);
      System.out.println();
      Integer[] in={1,2,3,4};
      getElement(in);
  }
}
