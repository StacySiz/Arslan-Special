package com.test.data;

public class PostData {
    private String mainPostBody;

    public PostData() {}

    public PostData(String mainPostBody) {
        this.mainPostBody = mainPostBody;
    }

    public String getMainPostBody() {
        return mainPostBody;
    }

    public void setMainPostBody(String mainPostBody) {
        this.mainPostBody = mainPostBody;
    }
}
