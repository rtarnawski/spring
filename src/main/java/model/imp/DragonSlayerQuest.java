package model.imp;

import org.springframework.stereotype.Component;

@Component
public class DragonSlayerQuest implements Quest {
    @Override
    public void empbarkQuest() {

        System.out.println("Kill the dragon");
    }
}
