package io.github.pcb060.components;

import com.vaadin.flow.component.html.H3;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.orderedlayout.FlexLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import java.util.List;

public class ExpertiseSection extends VerticalLayout {
    private static final String CSS_CLASSNAME = "expertise";

    public ExpertiseSection() {
        setClassName(CSS_CLASSNAME);

        H3 expertiseSectionHeader = new H3("Strengths and Expertise");
        expertiseSectionHeader.setClassName(CSS_CLASSNAME + "-header");
        add(expertiseSectionHeader);

        FlexLayout expertiseListContainer = new FlexLayout();
        expertiseListContainer.setClassName(CSS_CLASSNAME + "-list");
        add(expertiseListContainer);

        List<String> expertiseList =
                List.of(
                        "Fullstack Development",
                        "Java (6 to 17)",
                        "Test-Driven Design",
                        "Unix",
                        "Bash",
                        "Git (+ Gitflow)",
                        "Agile Methodology",
                        "PostgreSQL",
                        "DevOps");

        expertiseList.stream()
                .map(
                        exp -> {
                            Span expSpan = new Span(exp);
                            return expSpan;
                        })
                .forEach(expertiseListContainer::add);
    }
}
