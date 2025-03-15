package io.github.pcb060.applayout;

import com.vaadin.flow.component.applayout.AppLayout;
import com.vaadin.flow.router.Layout;

import io.github.pcb060.MainView;

@Layout
public class MainAppLayout extends AppLayout {
    public MainAppLayout() {
        MainView mainView = new MainView();
        setContent(mainView);
        // NavbarPlacement navbar = new NavbarPlacement();
        // addToNavbar(navbar);
    }
}
