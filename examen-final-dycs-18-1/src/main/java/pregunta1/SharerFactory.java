package pregunta1;

public enum SharerFactory {
    FACTORY;
    
    public Sharing getSharer(SharerType sharerType) {
        Sharing sharing = null;
        switch (sharerType) {
            case Facebook: sharing = new FacebookSharer(); break;
            case Twitter: sharing = new TwitterSharer(); break;            
            case Reddit: sharing = new SharingAdapter(); break;
            default : break;
        }
        return sharing;
    }
    
    public Sharing getObjSharer(SharerType sharerType) {
        Sharing sharing = null;
        switch (sharerType) {
            case Facebook: sharing = new FacebookSharer(); break;
            case Twitter: sharing = new TwitterSharer(); break;            
            case Reddit: sharing = new SharingObjAdapter(new RedditPoster()); break;
            default : break;
        }
        return sharing;
    }
}
