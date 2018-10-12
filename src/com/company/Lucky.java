package com.company;

public class Lucky {

    public int LuckyNumber;

    public Lucky (int luckyNum, String luckName)
    {

        luckyNum = (int)(Math.random() * 100 + 1);
        LuckyNumber = luckyNum;

    }



}
