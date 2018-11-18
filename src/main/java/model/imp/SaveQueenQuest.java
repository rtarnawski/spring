package model.imp;

import org.springframework.stereotype.Component;
@Component
public class SaveQueenQuest implements Quest {

    @Override
    public void empbarkQuest() {

        System.out.println("Save the Queen");
    }
}
