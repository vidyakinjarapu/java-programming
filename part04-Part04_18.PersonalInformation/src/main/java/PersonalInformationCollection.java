
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        // implement here your program that uses the PersonalInformation class

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            System.out.print("First name:");
            String first = scanner.nextLine();
            if(first.equals("")){
                break;
            }
            System.out.print("Last name:");
            String last = scanner.nextLine();
            System.out.print("Identification number:");
            String ID = scanner.nextLine();
            
            infoCollection.add(new PersonalInformation(first, last, ID));
        }
//        System.out.println("First name:");
        System.out.println("");
        for(PersonalInformation info: infoCollection){
            System.out.println(info.getFirstName() + " " + info.getLastName());
        }
    }
}
