import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        String[] names = new String[5];
        int[] IDNums = new int[5];
        String[] emailList = new String[5];

        for(int i = 0; i < names.length; i++){
            System.out.println("Please enter names(" + (int)(5 - i) + " names left): ");
            names[i] = scan.nextLine().toUpperCase();
        }

        for (int i = 0; i < IDNums.length; i++) {
            int randomID = (int)(Math.random() * 888888 + 111111);

            IDNums[i] = randomID;
        }

        for (int i = 0; i < names.length; i++) {
            String firstInitial = names[i].substring(0,1);

            int lastNameIndex = names[i].indexOf(" ");
            String lastName = names[i].substring(lastNameIndex + 1);

            int lastDigits = IDNums[i] % 1000;

            emailList[i] = firstInitial + lastName + lastDigits + "@GO.TAHOMASD.US";
        }

        printRoster(names, IDNums, emailList);

        scan.close();
    }

    public static void printRoster(String[] names, int[] ids, String[] emails){
        for(int i = 0; i < names.length; i++){
            System.out.println("Name: " + names[i]);
            System.out.println("ID: " + ids[i]);
            System.out.println("Email: " + emails[i]);
            System.out.println();   
        }
    }
}
