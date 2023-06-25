package org.example.Practice_Codeing;
/*supliuer example returnn date object
 */

import java.util.Date;
import java.util.function.Supplier;

public class Suppplier {
    public static void main(String[] args) {
        Supplier<Date> s = () -> new Date();
        System.out.println(s.get());
    }
}
