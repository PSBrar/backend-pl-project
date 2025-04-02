package com.pl.PL.Backend.Project.player;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="player_statistic")
public class Player {

    @Id
    @Column(name="player_name", unique = true)
    private String name;

    private String position;

    private String nation;

    private Integer age;

    private Integer mp;

    private Integer starts;

    private Double min;

    private Double goals;

    private Double assists;

    private Double pk;

    private Double yellow_cards;

    private Double red_cards;

    private Double xgoals;

    private Double xag;

    private String team;

    public Player() {
    }

    public Player(String name, String position, String nation, Integer age, Integer mp, Integer starts, Double min, Double goals, Double assists, Double pk, Double yellow_cards, Double red_cards, Double xgoals, Double xag, String team) {
        this.name = name;
        this.position = position;
        this.nation = nation;
        this.age = age;
        this.mp = mp;
        this.starts = starts;
        this.min = min;
        this.goals = goals;
        this.assists = assists;
        this.pk = pk;
        this.yellow_cards = yellow_cards;
        this.red_cards = red_cards;
        this.xgoals = xgoals;
        this.xag = xag;
        this.team = team;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getMp() {
        return mp;
    }

    public void setMp(Integer mp) {
        this.mp = mp;
    }

    public Integer getStarts() {
        return starts;
    }

    public void setStarts(Integer starts) {
        this.starts = starts;
    }

    public Double getMin() {
        return min;
    }

    public void setMin(Double min) {
        this.min = min;
    }

    public Double getGoals() {
        return goals;
    }

    public void setGoals(Double goals) {
        this.goals = goals;
    }

    public Double getAssists() {
        return assists;
    }

    public void setAssists(Double assists) {
        this.assists = assists;
    }

    public Double getPk() {
        return pk;
    }

    public void setPk(Double pk) {
        this.pk = pk;
    }

    public Double getYellow_cards() {
        return yellow_cards;
    }

    public void setYellow_cards(Double yellow_cards) {
        this.yellow_cards = yellow_cards;
    }

    public Double getRed_cards() {
        return red_cards;
    }

    public void setRed_cards(Double red_cards) {
        this.red_cards = red_cards;
    }

    public Double getXgoals() {
        return xgoals;
    }

    public void setXgoals(Double xgoals) {
        this.xgoals = xgoals;
    }

    public Double getXag() {
        return xag;
    }

    public void setXag(Double xag) {
        this.xag = xag;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }
}
