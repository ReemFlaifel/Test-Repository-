package DevelopmentTest.DevelopmentTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	private List<Topic> topics = new ArrayList<Topic>(
			Arrays.asList(new Topic(1, "Spring", "Spring boot test"), new Topic(2, "Java", "Java test")));

	public List<Topic> getAlltopics() {
		return topics;
	}

	public Topic getTopicByID(int id) {
		for (Topic topic : topics) {
			if (topic.getId() == id) {
				return topic;
			}
		}
		return null;
	}

	public void addTopic(Topic topic) {
		topics.add(topic);
	}

	public void update(int id, Topic topic) {
		for(int i=0;i<topics.size();i++){
			if (topics.get(i).getId()==topic.getId()) {
				topics.set(i, topic);
			}
		}
	}
	}


