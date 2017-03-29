package com.airTicket.core;

import java.util.List;

public class CustomRequest {
    private List<Long> ids;

    public CustomRequest() {}

    public List<Long> getIds() {
        return ids;
    }

    public void setIds(List<Long> ids) {
        this.ids = ids;
    }
}
