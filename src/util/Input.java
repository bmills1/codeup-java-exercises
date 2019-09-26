package util;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Input test = new Input();
//        System.out.println(test.getString(""));
//        System.out.println(test.getString("This"));
//        System.out.println(test.yesNo());
        System.out.println(test.getInt(1, 10));
//        System.out.println(test.getDouble(1, 10.5));
    }

    private Scanner sc;

    public Input() {
        this.sc = new Scanner(System.in);
    }

    public String getString() {

        return this.sc.nextLine();
    }
    private String getString(String prompt) {
        if(prompt.isEmpty()){
            System.out.println("Type Something: ");

        }else {
            System.out.println(prompt);
        }
        return getString();
    }

    //
    boolean yesNo() {
        System.out.println("Type y/n");
        String yesorNo = this.sc.nextLine();
        if (yesorNo.equalsIgnoreCase("yes") || yesorNo.equalsIgnoreCase("y")) {
            return true;
        } else {
            return false;
        }

    }

    //
//
    public int getInt(int min, int max) {
        if (this.sc.hasNextInt()) {
            int userNum = Integer.parseInt(this.sc.nextLine());
            if (userNum >= min && userNum <= max) {
                return userNum;
            } else {
                System.out.println("Invalid Number Range");
            }
        } else {
            System.out.println("Invalid Input");
        }
        return 0;
    }
//
//
//
//
    public double getDouble(double min, double max) {
        System.out.println("Enter a decimal 1 and 10: ");
        if (sc.hasNextInt()) {
            int userNum = Integer.parseInt(this.sc.nextLine());
            if (userNum >= min && userNum <= max) {
                return userNum;
            } else {
                System.out.println("Invalid Num Range");
            }
        } else {
            System.out.print("Invalid Input");
        }
        return 0;
//       int userInput = getInteger(1, 10);
    }

//    double getDouble(double min, double max)
    public double getDouble(String prompt){
        System.out.println(prompt);
        return Double.parseDouble(this.sc.nextLine());
    }


}
