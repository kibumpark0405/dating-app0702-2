package datingapp.common;

import datingapp.MatchingApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { MatchingApplication.class })
public class CucumberSpingConfiguration {}
