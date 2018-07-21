package pregunta1;

public class SharingAdapter extends RedditPoster implements Sharing {

	@Override
	public void share(String message) {
		post(message);		
	}

}
