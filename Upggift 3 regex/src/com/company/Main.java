package com.company;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class Main {


    public static Matcher main(String[] args) {

        ArrayList<String> someWords = new ArrayList<String>();
        someWords.add("Bearbeta");
        someWords.add("Revidera");
        someWords.add("Springa");
        someWords.add("Äta");

        Pattern pattern = Pattern.compile("([aeiouy]\\w*){2,}");
        Matcher matcher = pattern.matcher(someWords);
        int counter = 0;
        while (matcher.find()) {
            counter++;


            if (someWords == pattern.matcher() ) {

                return matcher;
                System.out.println(matcher);

            } else {
                return null;
            }

        }

    }}

