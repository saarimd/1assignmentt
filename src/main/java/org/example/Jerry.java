package org.example;

import org.springframework.stereotype.Component;

@Component
public class Jerry {
    private String name = "Jerry";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
