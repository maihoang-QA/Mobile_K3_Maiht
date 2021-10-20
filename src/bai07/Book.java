package bai07;

public class Book {
    //Private Attribute
    private final String ISBN;
    private final String name;
    private final String author;

    private Book(Builder builder){
        this.ISBN = builder.ISBN;
        this.name = builder.name;
        this.author = builder.author;
    }

    //Methods Default
    public String getISBN(){
        return this.ISBN;
    }

    public void getBooksInfor(){
        System.out.println("ISBN of Book:" +this.ISBN);
        System.out.println("name of Book:" +this.name);
        System.out.println("author of Book:" +this.author);


    }

    //Inner Class
    public static class Builder{
        private String ISBN;
        private String name;
        private String author;

        public String getISBN(){
           return ISBN;
        }

        public Builder ISBN(String ISBN) {
            this.ISBN = ISBN;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder author(String author) {
            this.author = author;
            return this;
        }

        public Book build(){
            return new Book(this);
        }


    }

}
