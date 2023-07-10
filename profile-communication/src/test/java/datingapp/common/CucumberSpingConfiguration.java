package datingapp.common;

import datingapp.ProfileCommunicationApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { ProfileCommunicationApplication.class })
public class CucumberSpingConfiguration {}
