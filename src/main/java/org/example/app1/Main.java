package org.example.app1;

import java.util.concurrent.TimeUnit;
import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.print("Hello and welcome!");
        List<Integer> list = new ArrayList<Integer>();

        for (int i = 1; i <= 5000000; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
            list.add(i);
            System.out.println(list);
            try {
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e) {
                // Handle the exception (e.g., print an error message or log it)
                System.err.println("Sleep was interrupted: " + e.getMessage());
                // Restore the interrupted status
                Thread.currentThread().interrupt();
            }
        }
    }
}