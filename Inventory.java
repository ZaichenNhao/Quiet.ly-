import java.util.*;

public class Counterfeit {

  public static int countCounterfeit(List<String> serialNumber) {
    int re = 0;
    List<Integer> denomination = Arrays.asList(10,20,50,100,200,500,1000);
    for (int i = 0; i < serialNumber.size(); i++) {
      String serial = serialNumber.get(i);
      String abc = serial.substring(0, 3);

      //System.out.println("abc = " + abc);
      if (abc.matches("^[a-zA-Z]+$")) {
        if (abc == abc.toUpperCase()) {
          String first = abc.substring(0,1); 
          String second = abc.substring(1,2);
          String third = abc.substring(2,3);
          /*System.out.println("this is for:" + abc);
          System.out.println("first:" + first);
          System.out.println("second:" + second);
          System.out.println("third:" + third);*/

          if(!first.equals(second)&&!first.equals(third)){

            String year = serial.substring(3, 7);
            if (year.matches("^[0-9]*$")) {
              int y = Integer.parseInt(year);

              if (y >= 1900 && y <= 2019) {

                String last = serial.substring(serial.length() - 1, serial.length());

                if (last.matches("^[a-zA-Z]+$")) {
                  if (last == last.toUpperCase()) {

                    String amount = serial.substring(7, serial.length() - 1);

                    System.out.println(amount);

                    int money = Integer.parseInt(amount);

                    for(int f=0; f<denomination.size();f++){

                      if(money==denomination.get(f)){

                        re = money + re;
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }

    return re;
  }

  public static void main(String[] args) {
    List<String> myList = Arrays.asList("AVG190420T", "RTF20001000Z", "QWER201850G", "AFA199620E", "ERT1947200T",
        "RTY20202004", "DRV1984500Y", "ETB2010400G");
    int num = countCounterfeit(myList);
    System.out.println("Total bills worth: " + num);
  }

  // Example:
  // Serial No. T1 T2 T3 T4 Test 5 Valid Amt
  // AVG190420T ✔ ✔ ✔ ✔ ✔ 20
  // RTF20001000Z ✔ ✔ ✔ ✔ ✔ 1000
  // QWER201850G ✔ ✔ ✗ ✔ ✔ there is an R where the year is supposed to start
  // AFA199620E ✔ ✗ ✔ ✔ ✔ first three characters are not distinct (Done FIXED)
  // ERT1947200T ✔ ✔ ✔ ✔ ✔ 200
  // RTY20202004 ✔ ✔ ✗ ✔ ✗ the year 2020 is out of bounds, the last character is
  // not an uppercase letter
  // DRV1984500Y ✔ ✔ ✔ ✔ ✔ 500
  // ETB2010400G ✔ ✔ ✗ ✔ ✗ there are no bills for 400 denomination ??

  // In total, there are valid bills worth 20 + 1000 + 200 + 500 = 1720.

  // This has to print the value 1720.
}
