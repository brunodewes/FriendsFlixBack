package com.friendsflix.responses;

public class LoginResponse {

    public LoginResponse(Integer user_id) {
        this.user_id = user_id;
    }

    private Integer user_id;

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }
}
