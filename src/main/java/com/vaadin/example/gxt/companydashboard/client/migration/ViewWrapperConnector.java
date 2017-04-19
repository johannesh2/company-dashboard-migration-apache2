package com.vaadin.example.gxt.companydashboard.client.migration;

import com.vaadin.client.annotations.OnStateChange;
import com.vaadin.client.ui.AbstractComponentConnector;
import com.vaadin.example.gxt.companydashboard.shared.migration.ViewWrapperState;
import com.vaadin.example.gxt.companydashboard.ui.migration.ViewWrapper;
import com.vaadin.shared.ui.Connect;
import com.vaadin.shared.ui.Connect.LoadStyle;

@Connect(value = ViewWrapper.class, loadStyle = LoadStyle.EAGER)
public class ViewWrapperConnector extends AbstractComponentConnector {

	@OnStateChange({ "view" })
	private void onViewChange() {
		getWidget().setView(getState().view);
	}

	@Override
	public ViewWrapperState getState() {
		return (ViewWrapperState) super.getState();
	}

	@Override
	public ViewWrapperWidget getWidget() {
		return (ViewWrapperWidget) super.getWidget();
	}
}
