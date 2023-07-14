public class Main {
    public static void main(String[] args) {
        Author nosov = new Author("Nikolay", "Nosov");
        Author lermontov = new Author ("Michail", "Lermontov");
        System.out.println("Nosov.name = " + nosov.getAuthorName()+ " "+ nosov.getAuthorSurname());
        Book Neznaika = new Book("Neznaika", nosov, 1972);
        Book Borodino =new Book ("Borodino", lermontov,1812);
        System.out.println("Nosov.name = " + nosov.getAuthorName()+ " "  + nosov.getAuthorSurname()+ " " + Neznaika.getBookName()+ "  " + Neznaika.getBookYear());
        System.out.println("Lermontov.name = " + lermontov.getAuthorName()+ " "  + lermontov.getAuthorSurname()+ " " + Borodino.getBookName()+ "  " + Borodino.getBookYear());
        Borodino.setBookYear(2020);
        System.out.println(Borodino.getBookName() + "  было переиздано в  " +Borodino.getBookYear() +" году");
        System.out.println(lermontov.equals(nosov));
        System.out.println(lermontov.equals(lermontov));
        System.out.println("lermontov hash"+ lermontov.hashCode());
        System.out.println(lermontov.toString());
    }
}
