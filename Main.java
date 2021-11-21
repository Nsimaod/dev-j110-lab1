public class Main {
    public static void main(String[] args) {
        Publisher pub1=new Publisher("Проспект", "Москва");
        Publisher pub2=new Publisher("Питер", "Санкт-Петербург");
        Publisher pub3=new Publisher("БХВ", "Санкт-Петебург");
        Publisher pub4=new Publisher("Диалектика", "Киев");
        Book[] books=new Book[5];
        books[0]=new Book("Computer Science: основы программирования на Java, ООП, алгоритмы и структуры данных", new String[]{new String("Седжвик Роберт"), new String("Уэйн Кевин")}, 2018, pub2);
        books[1]=new Book("Разработка требований к программному обеспечению. 3-е издание, дополненное", "Вигерс Карл", 2019, pub3);
        books[2]=new Book("Java. Полное руководство, 10-е издание", "Шилдт Герберт", 2018, pub4);
        books[3]=new Book("C/C++. Процедурное программирование", "Полубенцева М.И.", 2017, pub3);
        books[4]=new Book("Конституция РФ", 2020, pub1);
        Book.printAll(books);
        pub3.setCity("Санкт-Петербург");
        Book.printAll(books);
        /* Поскольку класс Book хранит ссылку на объект Publisher, при вызове метода print вызывется метод getPublisher,
        который подтягивает актуальный объект Publisher, в поле которого city хранится исправленное название. */
        // test
    }
}
