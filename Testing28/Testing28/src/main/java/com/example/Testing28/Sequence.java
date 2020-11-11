package com.example.Testing28;

import java.util.*;

public class Sequence {

    public static int seq(List <Integer> dfd) {
        List<Integer> chet = new ArrayList();
        /*List<Integer> grup = Arrays.asList(1, 1, 1, 0, 0, 1, 1, 1, 1, 0, 0, 0, 1);*/
        Iterator<Integer> iss = dfd.iterator();
        Integer grs = 0;

        Integer fg;
        while (iss.hasNext()) {
            if (((Integer) iss.next()).equals(1)) {
                grs = grs + 1;
            } else if (((Integer) iss.next()).equals(0)) {
                chet.add(grs);
                fg = 0;
                grs = fg;
            }
        }

        Iterator vars = chet.iterator();

       /* while (vars.hasNext()) {
            Integer i = (Integer) vars.next();
            System.out.println(i);
        }*/

        Collections.addAll(chet, new Integer[0]);
        fg = (Integer) Collections.max(chet);
        return fg;
    }
}

