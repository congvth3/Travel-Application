package helloworld.chcompany.vuthecong.travelapplication.model;

/**
 * Created by vuthecong on 1/31/16.
 */
public class Location {
    private String title, thumbnailUrl;
    double rating;

    public Location () {
    }

    public Location(String location, String thumbnailUrl, double rating) {
        this.title = location;
        this.thumbnailUrl = thumbnailUrl;
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String location){
        this.title = location;
    }

    public String getThumbnailUrl(){
        return thumbnailUrl;
    }

    public void setThumbnailUrl(String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
    }

    public double getRating(){
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

}


