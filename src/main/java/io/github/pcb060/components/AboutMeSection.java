package io.github.pcb060.components;

import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.orderedlayout.FlexLayout;

import java.io.InputStream;
import java.util.Properties;

public class AboutMeSection extends FlexLayout {
    private static final String CSS_CLASSNAME = "aboutme";
    private static final String ABOUT_ME_TEXT;

    static {
        try (InputStream input =
                AboutMeSection.class.getClassLoader().getResourceAsStream("cv.properties")) {
            Properties properties = new Properties();
            properties.load(input);
            ABOUT_ME_TEXT = properties.getProperty("aboutMe");
        } catch (Exception e) {
            throw new RuntimeException("Failed to load properties", e);
        }
    }

    public AboutMeSection() {
        setClassName(CSS_CLASSNAME);

        Span descriptionSpan = new Span(ABOUT_ME_TEXT);
        descriptionSpan.setClassName(CSS_CLASSNAME + "-text");

        add(descriptionSpan);
    }
}
