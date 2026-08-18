package library.main;
import library.model.Book;
import library.model.DigitalResource;
import library.model.LibraryResource;
import library.service.ResourceService;
public class Main {
    public static void main(String[] args) {
        LibraryResource[] resources = new LibraryResource[5];
        resources[0]=new Book(
                101, "Programming with Java", "E. Balaguruswamy");
        resources[1]=new DigitalResource(
                102, "The C Programming Language", "Dennis Ritchie");
        resources[2]=new Book(
                103, "Software Engineering", "Pressman R.");
        resources[3]=new DigitalResource(
                104, "Machine Learning", "Mitchell M.");
        resources[4]=new Book(
                105, "Computer System Architecture", "Mano, Morris M.");
        int[] overdueDays = {5, 3, 0, 7, 4};

        System.out.println("SMART LIBRARY:");
        System.out.println("Library Name: "
                + LibraryResource.getLibraryName());
        System.out.println();
        System.out.println("RESOURCE DETAILS: ");
        ResourceService.displayResources(resources, overdueDays);

        System.out.println("TOTAL FINE TO BE PAID : ");
        double totalFine =
                ResourceService.calculateTotalFine(resources, overdueDays);
        System.out.println("Total Fine: Rs. " + totalFine);
        System.out.println();
        LibraryResource.displayTotalResources();
    }
}