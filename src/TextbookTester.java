public class TextbookTester {
    public static void main(String[] args) {
        Textbook book1 = new Textbook("Fundamentals of General, Organic, and Biological Chemistry", "John McMurry", "Science", 9780134015187L);
        Textbook book2 = new Textbook("How to Lie with Statistics", "Darrell Huff", "Math", 9780393310726L);
        Textbook book3 = new Textbook("United States History: Student Edition 2012", "William Francis Deverell", "History", 9780547484280L);

        // output of each textbook
        System.out.println("          Textbooks");
        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);
    }
}
