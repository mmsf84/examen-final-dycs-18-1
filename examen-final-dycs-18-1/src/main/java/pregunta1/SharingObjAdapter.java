package pregunta1;

public class SharingObjAdapter implements Sharing {

	RedditPoster redditPoster = null;
		
	public SharingObjAdapter(RedditPoster redditPoster) {
		this.redditPoster = redditPoster;
	}

	@Override
	public void share(String message) {
		redditPoster.post(message);		
	}

}
