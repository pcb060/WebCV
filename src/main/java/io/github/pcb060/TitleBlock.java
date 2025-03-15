package io.github.pcb060;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

public class TitleBlock extends Div {
    private static final String CSS_CLASSNAME = "titleblock";
    private static final String PROPIC_PATH = "images/propic.jpg";

    public TitleBlock() {
        setClassName(CSS_CLASSNAME);

        Image propic = new Image(PROPIC_PATH, "Jacopo Giusti");
        propic.setClassName("propic rounded");
        propic.setAlt("Jacopo Giusti");

        H2 jobTitle = new H2("Software\nEngineer");

        HorizontalLayout titleBlockContainer = new HorizontalLayout(propic, jobTitle);
        titleBlockContainer.setAlignItems(FlexComponent.Alignment.CENTER);
        titleBlockContainer.setClassName(CSS_CLASSNAME + "-container");
        add(titleBlockContainer);
    }
}
