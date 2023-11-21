package app;

import java.util.Scanner;

public class Main03 {
    static String[] names;
    static String searchName;
    static int count;

    public static void main(String[] args) {
        getOutput(getSearchName(provideData()));

    }

    private static String[] provideData() {
        return names = new String[]{"Bob", "Alice", "Tom", "Lucy", "Bob", "Lisa"};
    }

    private static String getSearchName(String[] name) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter search name : ");
        searchName = scanner.nextLine();
        scanner.close();
        System.out.println("Result:");
        for (String nm : name) {
            if (nm.equalsIgnoreCase(searchName)) {
                count++;
                System.out.println(count + ") " + nm);

            }
        }
        //Виправлення неправильного регістру імені, що шукають
        String searchNameEdit = searchName.substring(0,1).toUpperCase() + searchName.substring(1);
        if (count > 0)
            System.out.println("Number of names " + searchNameEdit + " is " + count);

        if (count == 0)
            System.out.println("Search name didn't found.");


        return "";


    }

    private static void getOutput(String output) {
        System.out.println(output);
    }

}
