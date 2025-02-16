package org.example;

import org.springframework.stereotype.Component;

@Component
public class Tom {
    private String name = "Tom";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
