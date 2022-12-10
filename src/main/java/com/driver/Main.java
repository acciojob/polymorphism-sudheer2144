package com.driver;
import java.util.*;
public class Main {
    static class Product
    {
        public int product(int x,int y)
        {
            return x*y;
        }
        public int product(int x,int y,int z)
        {
            return x*y*z;
        }
        public double product(double x,double y)
        {
            return (double)x*y;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Product p=new Product();
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=sc.nextInt();
        System.out.println(p.product(x,y));
        System.out.println(p.product(x,y,z));
        System.out.println(p.product((double)x,(double)y));

    }

}

