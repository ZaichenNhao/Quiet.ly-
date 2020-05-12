import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


cases = [];


class Result {

    /*
     * Complete the 'countCounterfeit' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING_ARRAY serialNumber as parameter.
     */

    public static int countCounterfeit(List<String> serialNumber) {

        int re = 0;

        for(int i = 0; i<serialNumber.size(); i++){

            String serial = serialNumber.get(i);
            String abc = serial.substring(0,3);

            if(abc.matches(".*[a-z].*")){

                if(abc==abc.toUpperCase()){

                    String year = serial.substring(3,7);

                    int y = Integer.parseInt(year);

                    if(y>=1900 && y<= 2019){

                        String last = serial.substring(serial.length()-2, serial.length()-1);

                        if(last.matches("^[0-9]*$")){
                            if(last==last.toUpperCase()){

                                String amount = serial.substring(7, serial.length()-2);

                                int money = Integer.ParseInt(amount);

                                re = money + re;
                            }
                        }
                    }
                }
            }
        }

        return re;
    }
}


while(true){
    countCounterfeit(cases);
}