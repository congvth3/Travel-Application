package helloworld.chcompany.vuthecong.travelapplication.data;

/**
 * Created by vuthecong on 2/25/16.
 */
public class FeedItem {
    private int id;
    private String name, status,image, url;

    public FeedItem() {

    }
    public FeedItem(int id, String name, String status, String image, String url) {
        super();
        this.id = id;
        this.name = name;
        this.status = status;
        this.image = image;
        this.url = url;
    }

    public int getId() {
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus (String status) {
        this.status = status;
    }
    public String getImage(){
        return image;
    }
    public void setImage (String image) {
        this.image = image;
    }
    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }
}
