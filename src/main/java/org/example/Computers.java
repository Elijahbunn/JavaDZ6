package org.example;

public class Computers {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private Integer osu;
    private Integer JD;
    private String os;
    private String color;

    public Integer getOsu() {
        return osu;
    }

    public void setOsu(Integer osu) {
        this.osu = osu;
    }

    public Integer getJD() {
        return JD;
    }

    public Computers() {
    }

    public Computers(String name, Integer osu, Integer JD, String os, String color) {
        this.name = name;
        this.osu = osu;
        this.JD = JD;
        this.os = os;
        this.color = color;
    }

    public void setJD(Integer JD) {
        this.JD = JD;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {

        return String.format("%s %d %d %s %s", name, osu, JD, os, color);
    }
}
