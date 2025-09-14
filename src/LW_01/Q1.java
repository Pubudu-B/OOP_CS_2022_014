package LW_01;

import java.util.*;
class Q1{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);

        System.out.print("Enter an odd-length word : ");
        String word=input.nextLine();

        int length=word.length();

        if((length%2)!=0){
            length=(length/2);
            char ch=word.charAt(length);
            System.out.println("Middle Character is : "+ch);

        }else{
            System.out.println("This isn't odd-length word");
        }

    }
}