import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.deluxan.model.Classifications;
import com.deluxan.service.ClassificationsService;

public class ClassificationsTest {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Configuration.xml");
		ClassificationsService classificationsService = (ClassificationsService) context.getBean("classificationsService");
		
		Classifications classifications = new Classifications();
//		classifications.setClassificationID(2);
		classifications.setClassificationName("Test");
		classificationsService.addClassification(classifications);
	}

}
