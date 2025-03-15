package io.github.pcb060;

import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.page.Page;
import com.vaadin.flow.theme.lumo.Lumo;

public class ThemeToggle extends HorizontalLayout {
    private static final String CSS_CLASSNAME = "theme-toggle";
    private final Button themeToggleButton;
    private final Icon sunIcon = VaadinIcon.SUN_O.create();
    private final Icon moonIcon = VaadinIcon.MOON.create();

    public ThemeToggle() {
        setClassName(CSS_CLASSNAME);
        themeToggleButton = new Button(sunIcon, event -> toggleTheme());
        themeToggleButton.getElement().setAttribute("aria-label", "Toggle theme");
        UI ui = UI.getCurrent();
        ui.getElement().getThemeList().remove(Lumo.LIGHT);
        ui.getElement().getThemeList().add(Lumo.DARK);

        // Restore theme and icon on page load
        UI.getCurrent()
                .getPage()
                .executeJs(
                        "const savedTheme = localStorage.getItem('theme');"
                                + "if (savedTheme === 'dark') {"
                                + "   document.documentElement.setAttribute('theme', 'dark');"
                                + "   $0.firstElementChild.remove(); $0.appendChild($1);"
                                + "} else {"
                                + "   document.documentElement.setAttribute('theme', 'light');"
                                + "   $0.firstElementChild.remove(); $0.appendChild($2);"
                                + "}",
                        themeToggleButton.getElement(),
                        sunIcon.getElement(),
                        moonIcon.getElement());

        add(themeToggleButton);
    }

    private void toggleTheme() {
        UI ui = UI.getCurrent();
        Page page = ui.getPage();

        page.executeJs(
                        "const currentTheme = document.documentElement.getAttribute('theme');"
                                + "const newTheme = currentTheme === 'dark' ? 'light' : 'dark';"
                                + "document.documentElement.setAttribute('theme', newTheme);"
                                + "localStorage.setItem('theme', newTheme);")
                .then(
                        result -> {
                            // This ensures the icon gets swapped after theme change
                            if (ui.getElement().getThemeList().contains(Lumo.DARK)) {
                                ui.getElement().getThemeList().remove(Lumo.DARK);
                                ui.getElement().getThemeList().add(Lumo.LIGHT);
                                themeToggleButton.setIcon(moonIcon);
                            } else {
                                ui.getElement().getThemeList().remove(Lumo.LIGHT);
                                ui.getElement().getThemeList().add(Lumo.DARK);
                                themeToggleButton.setIcon(sunIcon);
                            }
                        });
    }
}
