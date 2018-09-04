package DevelopmentTest.DevelopmentTest;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import org.mockito.InjectMocks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	@Autowired
	private TopicService topicService;

	@RequestMapping("/alltopics")
	public List<Topic> getTopics() {
		return topicService.getAlltopics();
	}

	@RequestMapping("/getTopic/{id}")
	public Topic getTopic(@PathVariable int id) {
		return topicService.getTopicByID(id);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/addTopic")
	public void addTopic(@RequestBody Topic topic) {
		topicService.addTopic(topic);

	}

	@RequestMapping(method = RequestMethod.POST, value = "/updateTopic/{id}")
	public void updateRequest(@PathVariable int id, @RequestBody Topic topic) {
		topicService.update(id, topic);

	}
}
