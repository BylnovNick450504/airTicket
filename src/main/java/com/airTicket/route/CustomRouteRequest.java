package com.airTicket.route;

public class CustomRouteRequest {
    private Long srcId;
    private Long destId;

    public CustomRouteRequest() {
    }

    public CustomRouteRequest(Long srcId, Long destId) {
        this.srcId = srcId;
        this.destId = destId;
    }

    public Long getSrcId() {
        return srcId;
    }

    public void setSrcId(Long srcId) {
        this.srcId = srcId;
    }

    public Long getDestId() {
        return destId;
    }

    public void setDestId(Long destId) {
        this.destId = destId;
    }
}
