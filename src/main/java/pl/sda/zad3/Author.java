package pl.sda.zad3;

import org.springframework.stereotype.Component;

@Component
public class Author {

    private String name;

    public Author() {
        name = "init value";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
