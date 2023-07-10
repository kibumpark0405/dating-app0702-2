package datingapp.common;

import datingapp.SecurityPrivacyApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { SecurityPrivacyApplication.class })
public class CucumberSpingConfiguration {}
