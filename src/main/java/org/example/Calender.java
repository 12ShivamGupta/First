package org.example;

import java.util.HashMap;
import java.util.Map;

public class Calender
{
    public boolean isSlotAvailable(int[][] schedules, int startSlot, int endSlot)
    {
        int arr[] = new int[1000];

        for(int sch[] : schedules)
        {
            int start = sch[0];
            int end = sch[1];

            for(int i=start ;i<end;i++)
                arr[i] = 1;
        }

        for(int i=startSlot; i<endSlot; i++)
        {
            if(arr[i]==1)
                return false;
        }

       return true;
    }
}
