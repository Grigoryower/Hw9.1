import java.util.Objects;

public class Book {
    private Author author;
    private String name;
    private int age;

    public Book (String name, int age) {
        this.name = name;
        this.age = age;
        this.author = author;}
    public Author getauthor(){
        return  this.author;
    }
    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }
    

    public boolean isAdult() {
             return getAge() > 1959;
         }
          public String toString() {
            return "Название  " + this.name + " Дата издания  " + this.age;
          }
    public void increaseAge(int increment) {
        if (increment < 0) {
            throw new IllegalArgumentException("Инкремент отрицательный");
        }
        this.age = age + increment;
    }



    public void setAuthor(Author author) {
        this.author = author;
    }

    public int hashCode() {
        return java.util.Objects.hash(name);
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return age == book.age && Objects.equals(author, book.author) && Objects.equals(name, book.name);
    }



}
