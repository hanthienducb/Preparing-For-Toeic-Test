package han.project.toeic;

import java.io.Serializable;

public class Representative implements Serializable{
	String id;
	String unit;
	String title;
	int image;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getImage() {
		return image;
	}

	public void setImage(int image) {
		this.image = image;
	}

	public Representative() {
		
	}

	public Representative(String id, String unit, String title, int image) {
		super();
		this.id = id;
		this.unit = unit;
		this.title = title;
		this.image = image;
	}

	@Override
	public String toString() {
		return "Representative [lesson=" + unit + ", title=" + title + ", image=" + image + "]";
	}

}
