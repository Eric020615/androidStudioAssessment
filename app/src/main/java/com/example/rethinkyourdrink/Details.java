package com.example.rethinkyourdrink;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Details {

    @PrimaryKey
    @NonNull
    private String Day;
    private String BeverageType,BeverageName,Amount;

    public Details() {
    }

    public Details(String day, String beverageType, String beverageName, String amount) {
        Day = day;
        BeverageType = beverageType;
        BeverageName = beverageName;
        Amount = amount;
    }

    public String getDay() {
        return Day;
    }

    public void setDay(String day) {
        Day = day;
    }

    public String getBeverageType() {
        return BeverageType;
    }

    public void setBeverageType(String beverageType) {
        BeverageType = beverageType;
    }

    public String getBeverageName() {
        return BeverageName;
    }

    public void setBeverageName(String beverageName) {
        BeverageName = beverageName;
    }

    public String getAmount() {
        return Amount;
    }

    public void setAmount(String amount) {
        Amount = amount;
    }
}
