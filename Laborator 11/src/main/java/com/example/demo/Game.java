package com.example.demo;

public class Game {
    /* A game must contain information about the players, a text representing the
    content of the game, the date and the result. A player must have at least a name. */
    int id;
    String name;
    String content;
    String date;
    String result;
    String namePlayer;

    public Game(int id, String name)
    {
        this.id = id;
        this.name = name;
        this.content = content;
        this.date = date;
        this.result = result;
        this.namePlayer = namePlayer;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getResult() {
        return result;
    }

    public void setNamePlayer(String namePlayer) {
        this.namePlayer = namePlayer;
    }

    public String getNamePlayer() {
        return namePlayer;
    }
}
