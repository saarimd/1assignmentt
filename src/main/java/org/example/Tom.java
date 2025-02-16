package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Tom {
    private String name = "Tom";

    @Autowired
    private Jerry jerry;


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String chasingJerry(){
        return name + " trying to catch " + jerry.getName();
    }
}
