package com.company;

/*

2206 Date Formatting

Correct the getFormattedString method so that it returns a string with parameters for formatting.
There should be a conclusion similar to the following:
31:10:13 15:59:59

Requirements:
1. The getFormattedString method must be public.
2. The getFormattedString method must be static.
3. The output to the screen should correspond to the condition of the task.
4. The getFormattedString method should return a string with the parameters for formatting
according to the condition of the task.

*/

import java.util.Date;

public class Solution {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(String.format(getFormattedString(), date, date, date, date, date, date));
        //должен быть вывод аналогичный следующему
        //31:10:13 15:59:59
    }

    public static String getFormattedString() {
        return "%td:%tm:%ty %tH:%tM:%tS";
    }
}

