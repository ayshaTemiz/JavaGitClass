package com.syntax.class20;


class MethodOverLoading {

    static void add(int...arr){  //if we are not sure the number of paramters, we can define like that.It can handle any number of parameters
        int sum=0;
        for(int number:arr){
            sum=sum+number;
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        int[] arr={10,20,30};
        MethodOverLoading.add(arr);
    }
}

