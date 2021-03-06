package gr.ntua.eestec.eestec_android_workshop;

public class FlickrPhotoset {

	private long mId;
	private String mTitle;
	private String mDescription;

	public FlickrPhotoset(long id, String title, String description) {

		mId = id;
		mTitle = title;
		mDescription = description;
	}

	public FlickrPhotoset(long id, String title) {

		this(id, title, null);
	}

	public long getId() {

		return mId;
	}

	public String getTitle() {

		return mTitle;
	}

	public String getDescription() {

		return mDescription;
	}
}
