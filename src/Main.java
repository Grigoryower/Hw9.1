public class Main {


    public static void main(String[] args) {
        Author author = new Author("Гарри ", " Гаррисон");
        if (author == author) {
            System.out.println("Автор " + author.getName() + author.getSurname());
        } else {
            System.out.println("ERROR");
        }
        Author name = new Author("Гарри", "Гаррисон");{
            System.out.println(name);

        }

        Book deathworld = new Book(" Неукротимая планета ", 1960);
        {
            if (deathworld.isAdult()) {
                System.out.println("Название книги " + deathworld.getName() + deathworld.getAge());
            } else {
                System.out.println("ERROR");
            }
            deathworld.increaseAge(0);
            System.out.println(deathworld);

        }

    }


}