package DevelopmentTest.DevelopmentTest;

public class Topic {
	private int id;
	private String name;
	private String description;

	Topic() {
	}

	Topic(int id, String name, String description) {
		this.name = name;
		this.id = id;
		this.description = description;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
