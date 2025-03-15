package io.github.pcb060.applayout;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

import io.github.pcb060.ThemeToggle;

public class NavbarPlacement extends HorizontalLayout {
    private static final String CSS_CLASSNAME = "navbar";
    private static final String TITLE = "Jacopo Giusti";

    public NavbarPlacement() {
        setClassName(CSS_CLASSNAME);

        Div spacer = new Div();
        spacer.setClassName("spacer");

        H1 titleSpan = new H1(TITLE);
        titleSpan.setClassName("title");

        ThemeToggle themeToggle = new ThemeToggle();

        HorizontalLayout navbarLayout = new HorizontalLayout(spacer, titleSpan, themeToggle);
        navbarLayout.setClassName(CSS_CLASSNAME + "-layout");
        add(navbarLayout);
    }
}
