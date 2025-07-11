package ex_28_ENUM;

public enum Lab118_ApiUrl {
    vwo("https://app.vwo.com"),
    katalon("https://katalon.com"),
    google("https://google.com");

    private String url;

    Lab118_ApiUrl(String url){
        this.url = url;
    }

    String getUrl(){
        return this.url;
    }
}
