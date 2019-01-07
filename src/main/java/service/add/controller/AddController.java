package service.add.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddController {

	
	private final Logger logger = LoggerFactory.getLogger(AddController.class);
	
	
	@RequestMapping(value="/api/v1/add", method = RequestMethod.GET)
	public double add(
			@RequestParam(value="value1", required=true) double value1,
			@RequestParam(value="value2", required=true) double value2
			) {

		logger.info("Request received for "+value1+"+"+value2);
		return value1+value2;
	}
	
}
