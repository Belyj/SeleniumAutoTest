package ru.auto.core;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import ru.sbtqa.tag.cucumber.TagCucumber;

/**
 *
 * @author sbt-svetlakov-av
 */
@RunWith(TagCucumber.class)
@CucumberOptions(monochrome = true,
        format = {"pretty"},
        glue = {"ru.sbtqa.tag.pagefactory.stepdefs"},
        features = {"src/test/resources/features/"},
        tags = {"@googleTest"})

public class CucumberTest {}