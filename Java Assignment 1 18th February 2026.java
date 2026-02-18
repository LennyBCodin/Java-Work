import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Question 1: Block Statement

        System.out.println("=== 1. Scope Demo ===");
        {
            int studentNumber = 194072;
            int bonus = 500;
            int sum = studentNumber + bonus;
            System.out.println("Calculation inside block: " + sum);
        }
        System.out.println("Variables inside the {} are no longer accessible.\n");


        //Question 2: If Statement

        System.out.println("=== 2. Height Classifier ===");
        System.out.print("Enter height in decimal (e.g. 5.8): ");
        double height = input.nextDouble();

        if (height >= 6.0) {
            System.out.println("Tall");
        } else if (height >= 5.58) {
            System.out.println("Average");
        } else {
            System.out.println("Short");
        }
        System.out.println();


      //Question 3: Switch Statement

        System.out.println("=== 3. Day of the Week ===");
        System.out.print("Enter a number (1-7): ");
        int dayNum = input.nextInt();

        switch (dayNum) {
            case 1: System.out.println("Monday"); break;
            case 2: System.out.println("Tuesday"); break;
            case 3: System.out.println("Wednesday"); break;
            case 4: System.out.println("Thursday"); break;
            case 5: System.out.println("Friday"); break;
            case 6: System.out.println("Saturday"); break;
            case 7: System.out.println("Sunday"); break;
            default: System.out.println("Invalid input!"); break;
        }
        System.out.println();


        //Question 4: While Loop

        System.out.println("=== 4. While Loop Counter ===");
        System.out.print("Enter a number to count up to: ");
        int limit = input.nextInt();
        int counter = 1;

        while (counter <= limit) {
            System.out.print(counter + " ");
            counter++;
        }
        System.out.println("\n");


       //Question 5: Do-While Loop

        System.out.println("=== 5. Access Control ===");
        int correctID = 194072;      
        String correctPass = "LennyProg";
        
        int enteredID;
        String enteredPass;

        do {
            System.out.print("Enter Student Number: ");
            enteredID = input.nextInt();
            System.out.print("Enter Password: ");
            enteredPass = input.next();

            if (enteredID != correctID || !enteredPass.equals(correctPass)) {
                System.out.println("Access Denied. Try again.");
            }
        } while (enteredID != correctID || !enteredPass.equals(correctPass));

        System.out.println("Access Granted!\n");


        //Question 6: For Loop

        System.out.println("=== 6. For Loop Pattern ===");
        System.out.print("Enter a starting number: ");
        int startNum = input.nextInt();

        for (int i = startNum; i >= 0; i--) {
           
            for (int j = i; j >= 0; j--) {
                System.out.print(j);
            }
            System.out.println();
        }

        input.close();
    }
}