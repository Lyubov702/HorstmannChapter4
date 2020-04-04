package com.mycode.color;

public enum Color {
    BLACK("black"),
    RED("red"),
    BLUE("blue"),
    GREEN("green"),
    CYAN("cyan"),
    MAGENTA("magenta"),
    YELLOW("yellow"),
    WHITE("white");
     String color;
     Color(String color) {
        this.color = color;
    }

    public String getGreen() {
        return "green";
    }
    public String getBlue() {
        return "blue";
    }
}

