package task;

import java.util.Objects;

public class Author {
    private final String name;
    private final String surname;

    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
    public String getName(){
        return name;
    }
    public String getSurName(){

        return surname;
    }

    public  String gerFullName(){
        return name + surname;
    }


    @Override

    public  boolean equals(Object obj){return equals(obj);}
    @Override
    public String toString() {
        return "Автор " + this.name + " " + this.surname;

    }
}
