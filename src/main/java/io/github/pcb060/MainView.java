package io.github.pcb060;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

import io.github.pcb060.applayout.MainAppLayout;

@Route(value = "", layout = MainAppLayout.class) // "home" is the URL path
@PageTitle("CV")
public class MainView extends VerticalLayout {
    private static final String CSS_CLASSNAME = "mainview";

    public MainView() {
        setClassName(CSS_CLASSNAME);
        VerticalLayout mainLayout = new VerticalLayout(Alignment.CENTER);
        mainLayout.setClassName(CSS_CLASSNAME + "-layout");

        TitleBlock titleBlock = new TitleBlock();
        mainLayout.add(titleBlock);

        ThemeToggle themeToggle = new ThemeToggle();

        add(mainLayout, themeToggle);
    }
}
