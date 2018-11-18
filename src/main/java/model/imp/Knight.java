package model.imp;

import java.util.ArrayList;
import java.util.List;

public class Knight {

    private String name;
    private Quest quest;
    private List<Quest> quests = new ArrayList<>();

    public List<Quest> getQuests() {

        return quests;
    }
    public void setQuests(List<Quest> quests) {

        this.quests = quests;
    }
    public Quest getQuest() {

        return quest;
    }
    public void setQuest(Quest quest) {

        this.quest = quest;
    }

    @Override
    public String toString() {

        return "Knight{" +
                "name='" + name + '\'' +
                ", quest=" + quest +
                '}';
    }
    public Knight() {

    }
    public String getName() {

        return name;
    }
    public void setName(String name) {

        this.name = name;
    }
}
