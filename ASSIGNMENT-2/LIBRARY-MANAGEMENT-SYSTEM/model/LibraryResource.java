package library.model;
public abstract class LibraryResource {
    private int resourceId;
    private String title;
    private String author;
    private static String libraryName="Nava Nalanda Library";
    private static int resourceCount=0;
    public LibraryResource(int resourceId, String title, String author) {
        this.resourceId = resourceId;
        this.title=title;
        this.author=author;
        resourceCount++;
    }
    public abstract double calculateFine(int overdueDays);
    public int getResourceId() {
        return resourceId;
    }
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public static String getLibraryName() {
        return libraryName;
    }
    public static int getResourceCount() {
        return resourceCount;
    }
    protected void setResourceId(int resourceId) {
        this.resourceId = resourceId;
    }
    protected void setTitle(String title) {
        this.title = title;
    }
    protected void setAuthor(String author) {
        this.author = author;
    }
    public static void displayTotalResources() {
        System.out.println("Total Resources Created: " + resourceCount);
    }
}