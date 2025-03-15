package io.github.pcb060.components;

import com.vaadin.flow.component.html.H3;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class ExperiencesSection extends VerticalLayout {
    private static final String CSS_CLASSNAME = "experiences";

    public ExperiencesSection() {
        setClassName(CSS_CLASSNAME);

        H3 expertiseSectionHeader = new H3("Professional Experience");
        expertiseSectionHeader.setClassName(CSS_CLASSNAME + "-header");
        add(expertiseSectionHeader);

        VerticalLayout experiencesContainer = new VerticalLayout();
        experiencesContainer.setClassName(CSS_CLASSNAME + "-container");
    }
}
