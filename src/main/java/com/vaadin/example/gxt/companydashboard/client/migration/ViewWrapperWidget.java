package com.vaadin.example.gxt.companydashboard.client.migration;

import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.Widget;
import com.vaadin.example.gxt.companydashboard.shared.migration.Views;

public class ViewWrapperWidget extends SimplePanel {

	public ViewWrapperWidget() {
	}

	public void setView(String view) {
		switch (view) {
		case Views.VIEW_DASHBOARD:
			doSetView("Company Dashboard", new Label("TODO"));
			break;
		default:
			break;
		}

	}

	private void doSetView(String heading, IsWidget view) {

		if (view instanceof Widget) {
			((Widget) view).setSize("100%", "100%");
		}
		setWidget(view);
	}
}
