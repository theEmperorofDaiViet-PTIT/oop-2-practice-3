/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.oop.swing.model;

/**
 *
 * @author Admin
 */
import java.io.Serializable;

public class Book implements Serializable {

    private static int currentID = 10000;

    private int id;

    private String title, author, major;

    private int amount;

    public Book() {
        this.id = ++currentID;
    }

    public Book(int id, String title, String author, String major, int amount) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.major = major;
        this.amount = amount;
    }

    public static int getCurrentID() {
        return currentID;
    }

    public static void setCurrentID(int currentID) {
        Book.currentID = currentID;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Object[] toObject() {
        return new Object[] {
                id, title, author, major, amount
        };
    }
}
