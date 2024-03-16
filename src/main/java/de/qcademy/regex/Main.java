package de.qcademy.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {


        /*Addition
        Scanner scanner = new Scanner(System.in);


        Pattern plusOppattern = Pattern.compile("\\s*(\\d+)\\s*\\+\\s*(\\d+)|\\s*\\+\\s*(\\d+)|\\s*(\\d+)");
        Pattern quitPattern = Pattern.compile("^\\s*:q\\s*$");


        boolean calculatorStoped = false;
        while (! calculatorStoped) {
            System.out.print("Ausdruck eingeben: ");
            String input = scanner.nextLine();
            Matcher plusOpMatcher = plusOppattern.matcher(input);
            Matcher quitMatcher = quitPattern.matcher(input);
            if (plusOpMatcher.matches()) {
                if (plusOpMatcher.group(4) != null) {            //null = leeres Objekt//
                    double result = Double.parseDouble(plusOpMatcher.group(4));
                    System.out.println(input + "= " + result);
                } else if (plusOpMatcher.group(3) != null) {
                    double result = Double.parseDouble(plusOpMatcher.group(3));
                    System.out.println(input + "= " + result);
                } else {
                    double firstOperand = Double.parseDouble(plusOpMatcher.group(1));
                    double secondOperand = Double.parseDouble(plusOpMatcher.group(2));
                    double result = firstOperand + secondOperand;
                    System.out.println(input + "= " + result);
                }

            } else if (quitMatcher.matches()) {
                System.out.println("Taschenrechner beendet! ");
                calculatorStoped = true;
            }else {
                System.err.println("Operation: " + input + " nicht erkannt! ");
            }
        }  */

        Scanner scanner = new Scanner(System.in);

        Pattern operationPattern = Pattern.compile("\\s*(\\d+)\\s*([-+*/%])\\s*(\\d+)|\\s*([-+*/%])\\s*(\\d+)|\\s*(\\d+)");
        Pattern quitPattern = Pattern.compile("^\\s*:q\\s*$");

        boolean calculatorStopped = false;

        while(! calculatorStopped) {
            System.out.println("Ausdruck eingeben: ");

            String input = scanner.nextLine();

            Matcher operationMatcher = operationPattern.matcher(input);
            Matcher quitMatcher = quitPattern.matcher(input);

            if (operationMatcher.matches()) {
                if (operationMatcher.group(6) != null) {
                    double result = Double.parseDouble(operationMatcher.group(6));
                    System.out.println(input + " = " + result);
                } else {
                    double firstOperand = Double.parseDouble(operationMatcher.group(1));
                    double secondOperand = Double.parseDouble(operationMatcher.group(3));
                    String operator = operationMatcher.group(2);
                    double result = 0;

                    if (operator.equals("+")) {
                        result = firstOperand + secondOperand;
                    } else if (operator.equals("-")) {
                        result = firstOperand - secondOperand;
                    } else if (operator.equals("*")) {
                        result = firstOperand * secondOperand;
                    }else if (operator.equals("/")) {
                        if (secondOperand == 0) {
                            System.err.println("Division durch Null ist nicht erlaubt!");
                            continue;
                        }
                        result = firstOperand / secondOperand;
                    } else if (operator.equals("%")) {
                        if (secondOperand == 0) {
                            System.err.println("Modulo Null ist nicht erlaubt!");
                            continue;
                        }
                        result = firstOperand % secondOperand;
                } else {
                        System.err.println("Ungültiger Operator! " + operator);
                        continue;
                    }
                    System.out.println(input + " = " + result);
                }
            } else if (quitMatcher.matches()) {
                scanner.close();
                System.out.println("Taschenrechner beendet!");
                calculatorStopped = true;
            } else {
                System.out.println("Operation nicht erkannt: " + input);
            }
        }
    }
}
