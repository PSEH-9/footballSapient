package com.sapient.football.models;


import org.json.JSONObject;

import java.util.List;

public class ResponseModel {
    List<JSONObject> list;

    public List<JSONObject> getList() {
        return list;
    }

    public void setList(List<JSONObject> list) {
        this.list = list;
    }
}
