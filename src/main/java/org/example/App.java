package org.example;

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);

        int[][] schedules = {{12,13}, {14,16}, {18,22}, {23,26}};

        int startSlot;
        int endSlot;

        System.out.println("Enter startSlot");
        startSlot = sc.nextInt();
        System.out.println("Enter endSlot");
        endSlot = sc.nextInt();

        Calender cl = new Calender();

        boolean flag = cl.isSlotAvailable(schedules,startSlot,endSlot);

        if(flag)
            System.out.println("Slot is Available");
        else
            System.out.println("Slot is not Available");
    }
}
