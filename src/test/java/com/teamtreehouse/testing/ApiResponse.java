package com.teamtreehouse.testing;

/**
 * Created by kylebudd on 10/24/17.
 */
public class ApiResponse {
    private final int status;
    private final String body;

    public ApiResponse(int status, String body) {
        this.status = status;
        this.body = body;
    }

    public int getStatus() {
        return status;
    }

    public String getBody() {
        return body;
    }
}
