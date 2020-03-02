package edu.iis.mto.lab_0;

import java.util.ArrayList;
import java.util.List;
// Detach tails algorithm
public class TailsGenerator {

    List<String> generatedTails;

    public List<String> tails(String value) {

        generatedTails = new ArrayList<>(value.length());

        for (int i = 0; i <= value.length(); i++) {
            generatedTails.add(value.substring(i));

        }

        return generatedTails;
    }

}
