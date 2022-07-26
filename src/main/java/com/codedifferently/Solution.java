package com.codedifferently;

public class Solution {
    public String howManyLettersDoYouSee(String input){
        int count = 0;
        for (int i = 0;i < input.length();i++){
            for (int j = 1; j<input.length();j++){
                if (input.charAt(i) == input.charAt(j)){
                    count++;
                }
            }
        }
        return ;
    }
}


