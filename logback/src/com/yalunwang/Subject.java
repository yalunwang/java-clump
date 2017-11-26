package com.yalunwang;

/**
 * Created by Administrator on 2017/11/26.
 */
public class Subject {

  public void hh()
   {
       //Builder.ff();
       System.out.println(  new  Builder().i+1);
   }
    static class Builder  {
        public   int i;
        public Builder(){}
        public static void ff()
        {
            System.out.println("我是静态方法");
        }
        public Builder(int num) {
            this.i=num;
        }
        public  void f()
        {
            new Subject().hh();
            System.out.println(i);
        }

    }
}
