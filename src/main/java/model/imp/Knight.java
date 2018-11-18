package model.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Scope("prototype")
public class Knight {

    private String name;

    @Autowired
    @Qualifier("saveQueenQuest")
    private Quest quest;
    @Override
    public String toString() {

        return "Knight{" +
                "name='" + name + '\'' +
                ", quest=" + quest +
                ", quests=" + quests +
                '}';
    }
    @Autowired
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

    public Knight() {

    }
    public String getName() {

        return name;
    }
    public void setName(String name) {

        this.name = name;
    }
}
