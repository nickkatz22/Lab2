import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	 Scanner scan = new Scanner(System.in);
     String userName;
     int userNum;
	 System.out.println("Welcome to lab 2! What is your name?");
             userName = scan.nextLine();

        System.out.println("Nice to meet you " + userName + "." + " " + "Please enter an integer between 1 and 100: ");
            userNum = scan.nextInt();

        System.out.println(userName + " Chose the integer " + userNum + "." + " Calculating...");

        if((userNum >= 1 && userNum <= 59) && userNum % 2 != 0) {
            System.out.println(userName + "'s" + " " + "Number is Odd");
        }
        else if((userNum >= 2 && userNum <= 24) && userNum % 2 == 0) {
            System.out.println(userName + "'s" + " " + "Number is Even and less than 25");
        }
        else if((userNum >= 26 && userNum <= 100) && userNum % 2 ==0) {
            System.out.println(userName + "'s" + " " + "Number is Even");
        }
        else if((userNum >= 61 && userNum <=99) && userNum % 2 != 0) {
            System.out.println(userName + "'s" + " " + "Number is Odd and over 60");
        }
        else {
            System.out.println(userName + " Please try again later");
        }
        }

    }

