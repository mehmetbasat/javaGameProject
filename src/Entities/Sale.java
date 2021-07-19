package Entities;

import Abstract.Entity;

import java.time.LocalDate;

public class Sale implements Entity {
    private int id;
    private int gameId;
    private int memberId;
    private LocalDate saleDate;


    public Sale() {

    }

    public Sale(int id, int gameId, int memberId, LocalDate saleDate) {
        this.id = id;
        this.gameId = gameId;
        this.memberId = memberId;
        this.saleDate = saleDate;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getGameId() {
        return gameId;
    }

    public void setGameId(int gameId) {
        this.gameId = gameId;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public LocalDate getSaleDate() {
        return saleDate;
    }

    public void setSaleDate(LocalDate saleDate) {
        this.saleDate = saleDate;
    }






}
