package io.zipcoder;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem6 {

    public static String writeInMilitaryTime(String timeToConvert) {
        //Regular Expression for parsing digital time
        //group 1 = hour, group 2 = minutes, group 3 = am or pm
        String timeFind = "(1[012]|[1-9]):([0-5][0-9])(am|pm)";


        String[] analogTime = { "Zero Zero", "Zero One", "Zero Two", "Zero Three", "Zero Four", "Zero Five", "Zero Six", "Zero Seven", "Zero Eight", "Zero Nine",
                                "Ten", "Eleven","Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen",
                                "Twenty", "Twenty One", "Twenty Two", "Twenty Three", "Twenty Four", "Twenty Five", "Twenty Six", "Twenty Seven", "Twenty Eight", "Twenty Nine",
                                "Thirty", "Thirty One", "Thirty Two", "Thirty Three", "Thirty Four", "Thirty Five", "Thirty Six", "Thirty Seven", "Thirty Eight", "Thirty Nine",
                                "Forty", "Forty One", "Forty Two", "Forty Three", "Forty Four", "Forty Five", "Forty Six", "Forty Seven", "Forty Eight", "Forty Nine",
                                "Fifty", "Fifty One", "Fifty Two", "Fifty Three", "Fifty Four", "Fifty Five", "Fifty Six", "Fifty Seven", "Fifty Eight", "Fifty Nine"};


        Integer[] matchRawtoAnalog = new Integer[2];

        Pattern p = Pattern.compile(timeFind);
        Matcher m = p.matcher(timeToConvert);

        if (m.find()){
            if (m.group(3).equals("pm")){
                //converts pm hours to military
                matchRawtoAnalog[0] = Integer.valueOf(m.group(1)) + 12;
            }
            else {
                //am hours don't need converting
                matchRawtoAnalog[0] = Integer.valueOf(m.group(1));
            }
            // takes minutes
            matchRawtoAnalog[1] = Integer.valueOf(m.group(2));
        }

        String printAnalogTime = "";
        if (matchRawtoAnalog[1] < 10){
            printAnalogTime = analogTime[matchRawtoAnalog[0]] + " Hundred " + analogTime[matchRawtoAnalog[1]] + " Hours";
        }
        else {
            printAnalogTime = analogTime[matchRawtoAnalog[0]] + " Hundred and " + analogTime[matchRawtoAnalog[1]] + " Hours";
        }

        return printAnalogTime;
    }

}
