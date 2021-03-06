package com.google.gwt.sample.stockwatcher.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;


public class StockWatcher implements EntryPoint {

	private VerticalPanel mainPanel = new VerticalPanel();
	private FlexTable stocksFlexTable = new FlexTable();
	private HorizontalPanel addPanel = new HorizontalPanel();
	private TextBox newSymbolTextBox = new TextBox();
	private Button addStockButton = new Button("Add");
	private Label lastUpdatedLabel = new Label();

	/** * Entry point method. */
	public void onModuleLoad() { // Create table for stock data.
									// stocksFlexTable.setText(0, 0, "Symbol");
									// stocksFlexTable.setText(0, 1, "Price");
									// stocksFlexTable.setText(0, 2, "Change");
									// stocksFlexTable.setText(0, 3, "Remove");

		// Assemble Add Stock panel.
		addPanel.add(newSymbolTextBox);
		addPanel.add(addStockButton);

		// Assemble Main panel.
		mainPanel.add(stocksFlexTable);
		mainPanel.add(addPanel);
		mainPanel.add(lastUpdatedLabel);

		// Associate the Main panel with the HTML host page.
		RootPanel.get("stockList").add(mainPanel);

		// Move cursor focus to the input box.
		newSymbolTextBox.setFocus(true);

	// Listen for mouse events on the Add button.
    addStockButton.addClickHandler(new ClickHandler() {
      public void onClick(ClickEvent event) {
        addStock();
        theBestFunction();
      }
      
      
    });// Listen for keyboard events in the input box.
    newSymbolTextBox.addKeyDownHandler(new KeyDownHandler() {
        public void onKeyDown(KeyDownEvent event) {
          if (event.getNativeKeyCode() == KeyCodes.KEY_ENTER) {
            addStock();
          }
        }
      });

  }

	public void theBestFunction(){
		JOptionPane.showMessageDialog(frame, "(>'-')> <('-'<) ^(' - ')^ <('-'<) (>'-')>");
	
}
  /**
   * Add stock to FlexTable. Executed when the user clicks the addStockButton or
   * presses enter in the newSymbolTextBox.
   */
  private void addStock() {
    // TODO Auto-generated method stub

  }


}