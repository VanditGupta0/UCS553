package library.service;
import library.model.LibraryResource;
import library.model.Printable;
import library.util.InputValidator;
public class ResourceService {
    public static void displayResources(LibraryResource[] resources, int[] overdueDays) {
        for (int i = 0; i < resources.length; i++) {
            if (resources[i] != null) {
                if (InputValidator.validateResourceId(resources[i].getResourceId())) {
                    if (resources[i] instanceof Printable) {
                        ((Printable) resources[i]).printDetails();
                    }
                    if (InputValidator.validateFineDays(overdueDays[i])) {
                        System.out.println("Overdue Days  : " + overdueDays[i]);
                        System.out.println("Fine          : Rs. " + resources[i].calculateFine(overdueDays[i]));
                    }
                    System.out.println();
                }
            }
        }
    }
    public static double calculateTotalFine(
            LibraryResource[] resources, int[] overdueDays) {

        double totalFine=0;
        for (int i=0; i<resources.length; i++) {
            if (resources[i] !=null &&
                    InputValidator.validateFineDays(overdueDays[i])) {
                totalFine +=resources[i].calculateFine(overdueDays[i]);
            }
        }
        return totalFine;
    }
}