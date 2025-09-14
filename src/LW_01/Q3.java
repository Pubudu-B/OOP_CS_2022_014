package LW_01;

import java.util.*;
class Q3{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);

        System.out.print("Enter the amount of centimeters : ");
        double cm=input.nextDouble();

        double inches=cm/2.54;
        int feets=(int)(inches/12);
        inches=inches%12;

        System.out.print(feets+" feets"+" and "+inches+" inches ");
    }
}
