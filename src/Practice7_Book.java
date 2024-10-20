public class Practice7_Book {
    public static void main(String[] args) {
        Book book1 = new Book("Война и мир", "Л.Н.Толстой", 1863);
        Book book2 = new Book("Преступление и наказание", "Ф.М.Достоевский", 1863);
        Printable[] printable = {book1, book2};
        Book.printBooks(printable);

    }

    public interface Printable{
        void print();
    }

     public static class Book implements Printable {
        private String name;
        private String author;
        private int year;
        Book(String name, String author, int year){
            this.name = name;
            this.author = author;
            this.year = year;
        }
        public String getname(){
            return this.name;
        }
        public void print(){
            System.out.printf("Книга '%s' (автор %s) была издана в %d году\n", name, author, year);
        }
         public static void printBooks(Printable[] printable) {
             for (Printable item : printable) {
                 if (item instanceof Book) {
                     System.out.println(((Book)item).getname());
                 }
             }
         }

     }
}