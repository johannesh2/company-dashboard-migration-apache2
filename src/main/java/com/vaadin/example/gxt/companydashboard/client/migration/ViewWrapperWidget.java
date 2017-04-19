package com.vaadin.example.gxt.companydashboard.client.migration;

import com.google.gwt.core.shared.GWT;
import com.google.gwt.user.client.ui.IsWidget;
import com.sencha.gxt.widget.core.client.container.Viewport;
import com.vaadin.example.gxt.companydashboard.client.CompanyDashboard;
import com.vaadin.example.gxt.companydashboard.shared.migration.Views;

public class ViewWrapperWidget extends Viewport {

	public void setView(String view) {
		switch (view) {
		case Views.VIEW_DASHBOARD:
			doSetView(GWT.create(CompanyDashboard.class));
			break;
		default:
			break;
		}
		forceLayout();
	}

	private void doSetView(IsWidget view) {
		if (getWidgetCount() > 0) {
			clear();
		}
		add(view);
	}
}
