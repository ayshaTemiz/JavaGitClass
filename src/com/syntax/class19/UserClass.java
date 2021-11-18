package com.syntax.class19;

public class UserClass {
    //  Write program: userClass  that has a constructor that initializes instance variable name and mobile number.
//  Create a subclass  userInfo that will have user address variable and it also being initialized through constructor call.
//  Print users name, mobile number and address in userDetails method. Test your code.

    String name;
    int mobileNum;

    public UserClass (String name,int mobileNum){
        this.name=name;
        this.mobileNum=mobileNum;
    }
}

class UserInfo extends UserClass{

    String address;

    public UserInfo (String name,int mobileNum,String address){
        super(name,mobileNum);
        this.address=address;
    }

    public void userDetails(){
        System.out.println(name+" "+mobileNum+" "+address);
    }

}
