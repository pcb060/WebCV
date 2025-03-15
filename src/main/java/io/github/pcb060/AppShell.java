package io.github.pcb060;

import com.vaadin.flow.component.page.AppShellConfigurator;
import com.vaadin.flow.server.PWA;
import com.vaadin.flow.theme.Theme;

/**
 * Use the @PWA annotation make the application installable on phones, tablets and some desktop
 * browsers.
 */
@PWA(name = "Jacopo Giusti - CV", shortName = "Jacopo Giusti CV")
@Theme("my-theme")
public class AppShell implements AppShellConfigurator {}
