package customList;

import customList.models.Interpreter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String input = "";
        Interpreter interpret = new Interpreter();

        while (!(input=reader.readLine()).equals("END")) {
            interpret.implementCommand(input);
        }
    }

}
