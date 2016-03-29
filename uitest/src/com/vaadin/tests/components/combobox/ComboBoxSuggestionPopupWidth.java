package com.vaadin.tests.components.combobox;

import java.util.Arrays;
import java.util.List;

import com.vaadin.server.VaadinRequest;
import com.vaadin.tests.components.AbstractTestUI;
import com.vaadin.ui.ComboBox;

public class ComboBoxSuggestionPopupWidth extends AbstractTestUI {

    private static List<String> items = Arrays.asList("abc", "cde", "efg",
            "ghi", "ijk", "more items 1", "more items 2", "more items 3",
            "Ridicilously long item caption so we can see how the ComboBox displays ridicilously long captions in the suggestion pop-up",
            "more items 4", "more items 5", "more items 6", "more items 7");

    @Override
    protected void setup(VaadinRequest request) {
        ComboBox cb = new ComboBox(
                "200px wide ComboBox with default width (100%) suggestion popup",
                items);
        cb.setWidth("200px");
        addComponent(cb);

        ComboBox cb2 = new ComboBox(
                "200px wide ComboBox with 200% wide suggestion popup", items);
        cb2.setWidth("200px");
        cb2.setPopupWidth("200%");
        addComponent(cb2);

        ComboBox cb3 = new ComboBox(
                "200px wide ComboBox with 300px wide suggestion popup", items);
        cb3.setWidth("200px");
        cb3.setPopupWidth("300px");
        addComponent(cb3);

        ComboBox cb4 = new ComboBox(
                "200px wide ComboBox with legacy mode suggestion popup setPopupWidth(null)",
                items);
        cb4.setWidth("200px");
        cb4.setPopupWidth(null);
        addComponent(cb4);

    }

    @Override
    protected String getTestDescription() {
        return "Suggestion pop-up's width should be the same width as the ComboBox itself";
    }

    @Override
    protected Integer getTicketNumber() {
        return 19685;
    }

}
