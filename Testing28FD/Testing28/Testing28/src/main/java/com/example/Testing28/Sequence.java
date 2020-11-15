package com.example.Testing28;
import java.util.TreeSet;
import java.util.*;

public class Sequence {

    public static int seq(List < Integer > onezero) {
        TreeSet < Integer > chet = new TreeSet < Integer > ();
        chet.add(0);
        Iterator < Integer > iss = onezero.iterator();
        Iterator < Integer > mimMax = chet.iterator();
        Integer consecutiveNumbers = 0;
        Integer zero = 0;
        Integer number = 0;


        if (onezero.isEmpty() == true) {

            return number;
        }


        while (iss.hasNext()) {

            if (((Integer) iss.next()).equals(1)) {
                consecutiveNumbers++;
                if (iss.hasNext() == false) {
                    if (number <= consecutiveNumbers) {
                        number = consecutiveNumbers;
                        break;
                    }
                }

            } else if (((Integer) iss.next()).equals(0)) {
                if (number <= consecutiveNumbers) {
                    number = consecutiveNumbers;

                }
                consecutiveNumbers = zero;

            } else if (!((Integer) iss.next()).equals(1) && (!((Integer) iss.next()).equals(0))) {
                if (number <= consecutiveNumbers) {
                    number = consecutiveNumbers;
                }

                consecutiveNumbers = zero;


            }


        }

        return number;
    }
}