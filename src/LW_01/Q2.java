package LW_01;

import java.util.*;
class Q2{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);

        System.out.print("Enter your first name : ");
        String fname=input.nextLine();

        System.out.print("Enter your middle name : ");
        String mname=input.nextLine();

        System.out.print("Enter your last name : ");
        String lname=input.nextLine();

        char ch=mname.charAt(0);

        System.out.print(lname+","+fname+" "+ch);
    }
}
