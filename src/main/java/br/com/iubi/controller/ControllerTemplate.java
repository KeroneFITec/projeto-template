package br.com.iubi.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.Controller;

@RestController
public class ControllerTemplate {

	private static final Logger LOG = LogManager.getLogger(Controller.class);

    @GetMapping(value = "/generate_logs")
    public String generateLogs() {
        LOG.info("Example of INFO level log ..........");
        LOG.debug("Example of DEBUG level log ..........");
        LOG.warn("Example of WARN level log ..........");
        LOG.error("Example of ERROR level log ..........");
        return "Log types generated";
    }
}

