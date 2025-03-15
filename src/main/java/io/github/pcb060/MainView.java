package io.github.pcb060;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

import io.github.pcb060.applayout.MainAppLayout;
import io.github.pcb060.components.AboutMeSection;
import io.github.pcb060.components.ExperiencesSection;
import io.github.pcb060.components.ExpertiseSection;
import io.github.pcb060.components.ThemeToggle;
import io.github.pcb060.components.TitleSection;

@Route(value = "", layout = MainAppLayout.class) // "home" is the URL path
@PageTitle("CV")
public class MainView extends VerticalLayout {
    private static final String CSS_CLASSNAME = "mainview";

    public MainView() {
        setClassName(CSS_CLASSNAME);
        VerticalLayout mainLayout = new VerticalLayout(Alignment.CENTER);
        mainLayout.setClassName(CSS_CLASSNAME + "-layout");

        TitleSection titleSection = new TitleSection();
        AboutMeSection aboutMeSection = new AboutMeSection();
        ExpertiseSection expertiseSection = new ExpertiseSection();
        ExperiencesSection experiencesSection = new ExperiencesSection();
        mainLayout.add(titleSection, aboutMeSection, expertiseSection, experiencesSection);

        ThemeToggle themeToggle = new ThemeToggle();

        add(mainLayout, themeToggle);
    }
}
