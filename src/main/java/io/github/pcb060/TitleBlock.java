package io.github.pcb060;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class TitleBlock extends Div {
    private static final String CSS_CLASSNAME = "titleblock";
    private static final String PROPIC_PATH = "images/propic.png";
    private static final String MY_FULLNAME = "Jacopo Giusti";
    private static final String MY_JOBTITLE = "Software Engineer";

    public TitleBlock() {
        setClassName(CSS_CLASSNAME);

        Image propic = new Image(PROPIC_PATH, MY_FULLNAME);
        propic.setClassName("propic rounded");
        propic.setAlt(MY_FULLNAME);

        H1 nameTitle = new H1(MY_FULLNAME);
        H2 jobTitle = new H2(MY_JOBTITLE);

        VerticalLayout titlesContainer = new VerticalLayout(nameTitle, jobTitle);
        titlesContainer.setClassName(CSS_CLASSNAME + "-titles");

        HorizontalLayout titleBlockContainer = new HorizontalLayout(propic, titlesContainer);
        titleBlockContainer.setAlignItems(FlexComponent.Alignment.CENTER);
        titleBlockContainer.setClassName(CSS_CLASSNAME + "-container");
        add(titleBlockContainer);
    }
}
