package com.reto.reto3.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

public class Client {
    private  Integer idClient;
    private  String email;
    private  String password;
    private  String name;
    private  Integer age;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<Message> messages;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<ReservationRequest> reservations;

    public Client() {
    }

    public Client(Integer idClient, String email, String password, String name, Integer age,
                  List<Message> messages, List<ReservationRequest> reservations) {
        this.idClient = idClient;
        this.email = email;
        this.password = password;
        this.name = name;
        this.age = age;
        this.messages = messages;
        this.reservations = reservations;
    }

    public Integer getIdClient() {
        return idClient;
    }

    public void setIdClient(Integer idClient) {
        this.idClient = idClient;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public List<Message> getMessages() {
        return messages;
    }

    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }

    public List<ReservationRequest> getReservations() {
        return reservations;
    }

    public void setReservations(List<ReservationRequest> reservations) {
        this.reservations = reservations;
    }
}
