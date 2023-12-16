package com.example.starter.base;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import org.vaadin.miki.superfields.numbers.SuperBigDecimalField;

@Route("")
public class MainView extends VerticalLayout {

  public MainView() {
    SuperBigDecimalField superBigDecimalField = new SuperBigDecimalField();
    superBigDecimalField.withNegativeValueAllowed(false);
    superBigDecimalField.setPreventingInvalidInput(true);
    superBigDecimalField.setMaximumSignificandFractionDigits(2);
    add(superBigDecimalField);
  }
}
