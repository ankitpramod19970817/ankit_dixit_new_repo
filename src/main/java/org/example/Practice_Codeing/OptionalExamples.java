package org.example.Practice_Codeing;

import java.util.Optional;

public class OptionalExamples {
    public static Optional<String> Ofnullable(){
        Optional<String> optionalString =Optional.ofNullable(null);
        return optionalString;
    }
    public static Optional<String> Of(){
        Optional<String> optionalString =Optional.of(null);
        return optionalString;
    }

    public static void main(String[] args) {
        System.out.println(Ofnullable());
        System.out.println(Of());

    }
}
