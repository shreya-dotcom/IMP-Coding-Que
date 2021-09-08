package com.company;
import java.util.regex.*;
public class Main {

    public static void main(String[] args){
        int cnt=0; //counter to find number of times pattern present in given string
       Pattern p = Pattern.compile("ab");
       Matcher m = p.matcher("abaaabbaab");

       while(m.find()){ //it will search for pattern in string
           cnt++;
           System.out.println("Pattern found at "+m.start()+"...."+m.end()+" => "+m.group()); //give the index of pattern in string
       }

       System.out.println("Pattern found "+cnt+" times");
    }
}
