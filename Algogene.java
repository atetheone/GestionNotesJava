package com.company;
import java.util.List;

public class Algogene {
    public static void tri(List t, Compare op){
        for (int i = t.size() - 1; i >= 0; i--){
            for (int j  = 1; j <= i; j++){
                if (op.sup( t.get(j), t.get(j - 1) )) {
                    Object tmp = t.get(j - 1);
                    t.set(j - 1, t.get(j));
                    t.set(j, tmp);
                }
            }
        }
    }
}
