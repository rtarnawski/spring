package model.imp;

public class Knight {

    private String name;
    private Quest quest;

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
