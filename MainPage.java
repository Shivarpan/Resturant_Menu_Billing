package javaMenuBillingSystem;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;

import static javafx.application.Application.launch;

import java.util.ArrayList;

import javafx.geometry.Insets; 
import javafx.geometry.Pos; 

import javafx.scene.Scene; 
import javafx.scene.control.Button; 
import javafx.scene.control.CheckBox; 
import javafx.scene.control.ChoiceBox; 
import javafx.scene.layout.GridPane; 
import javafx.scene.text.Text; 
import javafx.scene.control.TextField; 
import javafx.stage.Stage;  

public class MainPage extends Application {
	
	public void start(Stage primaryStage) throws Exception{
		
		Text heading = new Text("Welcome to the Resturant");
		
		ArrayList<String> strList = new ArrayList<>(); 
		
		Button btnNepaliMenu = new Button("Nepali Menu");
		Button btnIndianMenu = new Button("Indian Menu");
		Button btnChineseMenu = new Button("Chinese Menu");
		Button btnOrder = new Button("Confirm Order");
		
		
		
		OrderDetail orderDetail = new OrderDetail();
		
		btnNepaliMenu.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				
				Text menuHeading = new Text("Nepali Menu");
				Text itemName = new Text("Food Item");
				Text itemPrice = new Text("Price");
				Text itemQuantity = new Text("Quantity");
				
				String item1Name = "yomari";
				String item2Name = "alutama";
				String item3Name = "momo";
				
				int item1Price = 50;
				int item2Price = 100;
				int item3Price = 150;
				
				CheckBox c1 = new CheckBox();
				CheckBox c2 = new CheckBox();
				CheckBox c3 = new CheckBox();
				
		
				
				Text item1 = new Text(item1Name);
				Text item2 = new Text(item2Name);
				Text item3 = new Text(item3Name);
				
				Text price1 = new Text("Rs " + item1Price);
				Text price2 = new Text("Rs " + item2Price);
				Text price3 = new Text("Rs " + item3Price);
				
				
				ChoiceBox choice1 = new ChoiceBox();
				choice1.getItems().addAll("1","2","3","4","5");
				choice1.setDisable(true);
				
				ChoiceBox choice2 = new ChoiceBox();
				choice2.getItems().addAll("1","2","3","4","5");
				choice2.setDisable(true);
				
				ChoiceBox choice3 = new ChoiceBox();
			    choice3.getItems().addAll("1","2","3","4","5");
				choice3.setDisable(true);
				
				c1.setOnAction(new EventHandler<ActionEvent>() {

					@Override
					public void handle(ActionEvent arg0) {
					   if(c1.isSelected()) {
						   choice1.setDisable(false);
						   choice1.getSelectionModel().selectFirst();
					   }
					   else if(!c1.isSelected()) {
						   choice1.setDisable(true);
						   choice1.getSelectionModel().clearSelection();
					   }
						
					}
					
				});
				
				c2.setOnAction(new EventHandler<ActionEvent>() {

					@Override
					public void handle(ActionEvent arg0) {
					   if(c2.isSelected()) {
						   choice2.setDisable(false);
						   choice2.getSelectionModel().selectFirst();
					   }
					   else if(!c2.isSelected()) {
						   choice2.setDisable(true);
						   choice2.getSelectionModel().clearSelection();
					   }
						
					}
					
				});
				
				c3.setOnAction(new EventHandler<ActionEvent>() {

					@Override
					public void handle(ActionEvent arg0) {
					   if(c3.isSelected()) {
						   choice3.setDisable(false);
						   choice3.getSelectionModel().selectFirst();
					   }
					   else if(!c3.isSelected()) {
						   choice3.setDisable(true);
						   choice3.getSelectionModel().clearSelection();
					   }
						
					}
					
				});
				
				
				
				Button btnOk = new Button("Ok");
				
				GridPane gridPaneMenu = new GridPane();
				
				gridPaneMenu.setMinSize(500,500);
				gridPaneMenu.setPadding(new Insets(10,10,10,10));
				gridPaneMenu.setVgap(10);
				gridPaneMenu.setHgap(5);
				gridPaneMenu.setAlignment(Pos.CENTER);
				
				gridPaneMenu.add(menuHeading, 3, 0);
				gridPaneMenu.add(itemName, 2, 1);
				gridPaneMenu.add(itemPrice, 3, 1);
				gridPaneMenu.add(itemQuantity, 4,1);
				
				gridPaneMenu.add(c1, 0, 3);
				gridPaneMenu.add(item1, 2, 3);
				gridPaneMenu.add(price1, 3, 3);
				gridPaneMenu.add(choice1, 4, 3);
				
				gridPaneMenu.add(c2, 0, 4);
				gridPaneMenu.add(item2, 2, 4);
				gridPaneMenu.add(price2, 3, 4);
				gridPaneMenu.add(choice2, 4, 4);
				
				gridPaneMenu.add(c3, 0, 5);
				gridPaneMenu.add(item3, 2,5);
				gridPaneMenu.add(price3, 3, 5);
				gridPaneMenu.add(choice3, 4, 5);
				
				
				
				
				gridPaneMenu.add(btnOk, 0, 10);
				
				
				
				
				Scene secondScene = new Scene(gridPaneMenu);
				Stage secondStage = new Stage();
				secondStage.setScene(secondScene);
				secondStage.show();
				
				
				btnOk.setOnAction(new EventHandler<ActionEvent>() {

					@Override
					public void handle(ActionEvent arg0) {
						
						if(c1.isSelected()) {
							orderDetail.setItemName(item1Name);
							orderDetail.setItemPrice(item1Price);
							orderDetail.setItemQuantity(Integer.parseInt(choice1.getSelectionModel().getSelectedItem().toString()));
						}
						
						if(c2.isSelected()) {
							orderDetail.setItemName(item2Name);
							orderDetail.setItemPrice(item2Price);
							orderDetail.setItemQuantity(Integer.parseInt(choice2.getSelectionModel().getSelectedItem().toString()));
						}
						
						if(c3.isSelected()) {
							orderDetail.setItemName(item3Name);
							orderDetail.setItemPrice(item3Price);
							orderDetail.setItemQuantity(Integer.parseInt(choice3.getSelectionModel().getSelectedItem().toString()));
						}
						
						secondStage.close();
						
					}
					
				});
				
				
			}
			
		});
		
		btnIndianMenu.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				Text menuHeading = new Text("Indian Menu");
				Text itemName = new Text("Food Item");
				Text itemPrice = new Text("Price");
				Text itemQuantity = new Text("Quantity");
				
				String item1Name = "Somosa";
				String item2Name = "Dosa";
				String item3Name = "Idli";
				
				int item1Price = 25;
				int item2Price = 50;
				int item3Price = 40;
				
				CheckBox c1 = new CheckBox();
				CheckBox c2 = new CheckBox();
				CheckBox c3 = new CheckBox();
				
		
				
				Text item1 = new Text(item1Name);
				Text item2 = new Text(item2Name);
				Text item3 = new Text(item3Name);
				
				Text price1 = new Text("Rs " + item1Price);
				Text price2 = new Text("Rs " + item2Price);
				Text price3 = new Text("Rs " + item3Price);
				
				
				ChoiceBox choice1 = new ChoiceBox();
				choice1.getItems().addAll("1","2","3","4","5");
				choice1.setDisable(true);
				
				ChoiceBox choice2 = new ChoiceBox();
				choice2.getItems().addAll("1","2","3","4","5");
				choice2.setDisable(true);
				
				ChoiceBox choice3 = new ChoiceBox();
			    choice3.getItems().addAll("1","2","3","4","5");
				choice3.setDisable(true);
				
				c1.setOnAction(new EventHandler<ActionEvent>() {

					@Override
					public void handle(ActionEvent arg0) {
					   if(c1.isSelected()) {
						   choice1.setDisable(false);
						   choice1.getSelectionModel().selectFirst();
					   }
					   else if(!c1.isSelected()) {
						   choice1.setDisable(true);
						   choice1.getSelectionModel().clearSelection();
					   }
						
					}
					
				});
				
				c2.setOnAction(new EventHandler<ActionEvent>() {

					@Override
					public void handle(ActionEvent arg0) {
					   if(c2.isSelected()) {
						   choice2.setDisable(false);
						   choice2.getSelectionModel().selectFirst();
					   }
					   else if(!c2.isSelected()) {
						   choice2.setDisable(true);
						   choice2.getSelectionModel().clearSelection();
					   }
						
					}
					
				});
				
				c3.setOnAction(new EventHandler<ActionEvent>() {

					@Override
					public void handle(ActionEvent arg0) {
					   if(c3.isSelected()) {
						   choice3.setDisable(false);
						   choice3.getSelectionModel().selectFirst();
					   }
					   else if(!c3.isSelected()) {
						   choice3.setDisable(true);
						   choice3.getSelectionModel().clearSelection();
					   }
						
					}
					
				});
				
				
				
				Button btnOk = new Button("Ok");
				
				GridPane gridPaneMenu = new GridPane();
				
				gridPaneMenu.setMinSize(500,500);
				gridPaneMenu.setPadding(new Insets(10,10,10,10));
				gridPaneMenu.setVgap(10);
				gridPaneMenu.setHgap(5);
				gridPaneMenu.setAlignment(Pos.CENTER);
				
				gridPaneMenu.add(menuHeading, 3, 0);
				gridPaneMenu.add(itemName, 2, 1);
				gridPaneMenu.add(itemPrice, 3, 1);
				gridPaneMenu.add(itemQuantity, 4, 1);
				
				gridPaneMenu.add(c1, 0, 3);
				gridPaneMenu.add(item1, 2, 3);
				gridPaneMenu.add(price1, 3, 3);
				gridPaneMenu.add(choice1, 4, 3);
				
				gridPaneMenu.add(c2, 0, 4);
				gridPaneMenu.add(item2, 2, 4);
				gridPaneMenu.add(price2, 3, 4);
				gridPaneMenu.add(choice2, 4, 4);
				
				gridPaneMenu.add(c3, 0, 5);
				gridPaneMenu.add(item3, 2,5);
				gridPaneMenu.add(price3, 3, 5);
				gridPaneMenu.add(choice3, 4, 5);
				
				
				
				
				gridPaneMenu.add(btnOk, 0, 10);
				
				
				
				
				Scene secondScene = new Scene(gridPaneMenu);
				Stage secondStage = new Stage();
				secondStage.setScene(secondScene);
				secondStage.show();
				
				
				btnOk.setOnAction(new EventHandler<ActionEvent>() {

					@Override
					public void handle(ActionEvent arg0) {
						
						if(c1.isSelected()) {
							orderDetail.setItemName(item1Name);
							orderDetail.setItemPrice(item1Price);
							orderDetail.setItemQuantity(Integer.parseInt(choice1.getSelectionModel().getSelectedItem().toString()));
						}
						
						if(c2.isSelected()) {
							orderDetail.setItemName(item2Name);
							orderDetail.setItemPrice(item2Price);
							orderDetail.setItemQuantity(Integer.parseInt(choice2.getSelectionModel().getSelectedItem().toString()));
						}
						
						if(c3.isSelected()) {
							orderDetail.setItemName(item3Name);
							orderDetail.setItemPrice(item3Price);
							orderDetail.setItemQuantity(Integer.parseInt(choice3.getSelectionModel().getSelectedItem().toString()));
						}
						
						secondStage.close();
						
					}
					
				});
				
			}
			
		});
		
		btnChineseMenu.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				Text menuHeading = new Text("Chinese Menu");
				Text itemName = new Text("Food Item");
				Text itemPrice = new Text("Price");
				Text itemQuantity = new Text("Quantity");
				
				String item1Name = "Chicken Noodle";
				String item2Name = "Chicken Fried Rice";
				String item3Name = "Wanton Soup";
				
				int item1Price = 80;
				int item2Price = 100;
				int item3Price = 50;
				
				CheckBox c1 = new CheckBox();
				CheckBox c2 = new CheckBox();
				CheckBox c3 = new CheckBox();
				
		
				
				Text item1 = new Text(item1Name);
				Text item2 = new Text(item2Name);
				Text item3 = new Text(item3Name);
				
				Text price1 = new Text("Rs " + item1Price);
				Text price2 = new Text("Rs " + item2Price);
				Text price3 = new Text("Rs " + item3Price);
				
				
				ChoiceBox choice1 = new ChoiceBox();
				choice1.getItems().addAll("1","2","3","4","5");
				choice1.setDisable(true);
				
				ChoiceBox choice2 = new ChoiceBox();
				choice2.getItems().addAll("1","2","3","4","5");
				choice2.setDisable(true);
				
				ChoiceBox choice3 = new ChoiceBox();
			    choice3.getItems().addAll("1","2","3","4","5");
				choice3.setDisable(true);
				
				c1.setOnAction(new EventHandler<ActionEvent>() {

					@Override
					public void handle(ActionEvent arg0) {
					   if(c1.isSelected()) {
						   choice1.setDisable(false);
						   choice1.getSelectionModel().selectFirst();
					   }
					   else if(!c1.isSelected()) {
						   choice1.setDisable(true);
						   choice1.getSelectionModel().clearSelection();
					   }
						
					}
					
				});
				
				c2.setOnAction(new EventHandler<ActionEvent>() {

					@Override
					public void handle(ActionEvent arg0) {
					   if(c2.isSelected()) {
						   choice2.setDisable(false);
						   choice2.getSelectionModel().selectFirst();
					   }
					   else if(!c2.isSelected()) {
						   choice2.setDisable(true);
						   choice2.getSelectionModel().clearSelection();
					   }
						
					}
					
				});
				
				c3.setOnAction(new EventHandler<ActionEvent>() {

					@Override
					public void handle(ActionEvent arg0) {
					   if(c3.isSelected()) {
						   choice3.setDisable(false);
						   choice3.getSelectionModel().selectFirst();
					   }
					   else if(!c3.isSelected()) {
						   choice3.setDisable(true);
						   choice3.getSelectionModel().clearSelection();
					   }
						
					}
					
				});
				
				
				
				Button btnOk = new Button("Ok");
				
				GridPane gridPaneMenu = new GridPane();
				
				gridPaneMenu.setMinSize(500,500);
				gridPaneMenu.setPadding(new Insets(10,10,10,10));
				gridPaneMenu.setVgap(10);
				gridPaneMenu.setHgap(5);
				gridPaneMenu.setAlignment(Pos.CENTER);
				
				gridPaneMenu.add(menuHeading, 3, 0);
				gridPaneMenu.add(itemName, 2, 1);
				gridPaneMenu.add(itemPrice, 3, 1);
				gridPaneMenu.add(itemQuantity, 4, 1);
				
				gridPaneMenu.add(c1, 0, 3);
				gridPaneMenu.add(item1, 2, 3);
				gridPaneMenu.add(price1, 3, 3);
				gridPaneMenu.add(choice1, 4, 3);
				
				gridPaneMenu.add(c2, 0, 4);
				gridPaneMenu.add(item2, 2, 4);
				gridPaneMenu.add(price2, 3, 4);
				gridPaneMenu.add(choice2, 4, 4);
				
				gridPaneMenu.add(c3, 0, 5);
				gridPaneMenu.add(item3, 2,5);
				gridPaneMenu.add(price3, 3, 5);
				gridPaneMenu.add(choice3, 4, 5);
				
				
				
				
				gridPaneMenu.add(btnOk, 0, 10);
				
				
				
				
				Scene secondScene = new Scene(gridPaneMenu);
				Stage secondStage = new Stage();
				secondStage.setScene(secondScene);
				secondStage.show();
				
				
				btnOk.setOnAction(new EventHandler<ActionEvent>() {

					@Override
					public void handle(ActionEvent arg0) {
						
						if(c1.isSelected()) {
							orderDetail.setItemName(item1Name);
							orderDetail.setItemPrice(item1Price);
							orderDetail.setItemQuantity(Integer.parseInt(choice1.getSelectionModel().getSelectedItem().toString()));
						}
						
						if(c2.isSelected()) {
							orderDetail.setItemName(item2Name);
							orderDetail.setItemPrice(item2Price);
							orderDetail.setItemQuantity(Integer.parseInt(choice2.getSelectionModel().getSelectedItem().toString()));
						}
						
						if(c3.isSelected()) {
							orderDetail.setItemName(item3Name);
							orderDetail.setItemPrice(item3Price);
							orderDetail.setItemQuantity(Integer.parseInt(choice3.getSelectionModel().getSelectedItem().toString()));
						}
						
						secondStage.close();
						
					}
					
				});
				
			}
			
		});
		
		btnOrder.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				GridPane gridPaneTotal = new GridPane();
				Text headingTotal = new Text("Your Bill");
				Text headerItem = new Text("Item Name");
				Text headerPrice = new Text("Price");
				Text headerQuantity= new Text("Quantity");
				gridPaneTotal.setMinSize(500,500);
				gridPaneTotal.setPadding(new Insets(10,10,10,10));
				gridPaneTotal.setVgap(10);
				gridPaneTotal.setHgap(5);
				gridPaneTotal.setAlignment(Pos.CENTER);
				gridPaneTotal.add(headingTotal, 2, 0);
				gridPaneTotal.add(headerItem, 2, 2);
				gridPaneTotal.add(headerPrice,3, 2);
				gridPaneTotal.add(headerQuantity, 4, 2);
				
				
				int grandTotal=0;
				Text textItem[] = new Text[20];
				Text textPrice[] = new Text[20];
				Text textQuantity[] = new Text[20];
				
				int i=0;
				for(i = 0;i<orderDetail.getSize();i++) {
				   grandTotal += orderDetail.getItemPrice(i)*orderDetail.getItemQuantity(i);	
				   textItem[i] = new Text(orderDetail.getItemName(i));
				   textPrice[i] = new Text("Rs " + orderDetail.getItemPrice(i));
				   textQuantity[i] = new Text(orderDetail.getItemQuantity(i)+"");
				   
				   gridPaneTotal.add(textItem[i], 2, i+3);
				   gridPaneTotal.add(textPrice[i], 3, i+3);
				   gridPaneTotal.add(textQuantity[i], 4, i+3);
				   
				    
				}
				
				Text grandTotalText = new Text("Grand Total = Rs " + grandTotal);
				gridPaneTotal.add(grandTotalText, 2, i+5);
				
				Scene sceneTotal = new Scene(gridPaneTotal);
				Stage stageTotal = new Stage();
				stageTotal.setScene(sceneTotal);
				stageTotal.show();
				
				
			}
			
		});
		
		GridPane gridPane = new GridPane();
		
		gridPane.setMinSize(500,500);
		gridPane.setPadding(new Insets(10,10,10,10));
		gridPane.setVgap(10);
		gridPane.setHgap(5);
		gridPane.setAlignment(Pos.CENTER);
		gridPane.add(heading, 1, 0);
		gridPane.add(btnNepaliMenu, 1, 1);
		gridPane.add(btnIndianMenu, 1, 2);
		gridPane.add(btnChineseMenu, 1,3);
		gridPane.add(btnOrder, 1, 10);
		
		Scene scene = new Scene(gridPane);
	    primaryStage.setScene(scene);
	    primaryStage.show();
		
		
		
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	

}

class OrderDetail{
	public ArrayList<String> itemName;
	public ArrayList<Integer> itemPrice;
	public ArrayList<Integer> itemQuantity;
	
	public OrderDetail() {
		itemName = new ArrayList();
		itemPrice = new ArrayList();
		itemQuantity = new ArrayList();
		}
	
	public void setItemName(String itemName) {
		this.itemName.add(itemName);
	}
	
	public void setItemPrice(int itemPrice) {
		this.itemPrice.add(itemPrice);
	}
	
	public void setItemQuantity(int itemQuantity) {
		this.itemQuantity.add(itemQuantity);
		
	}
	
	public String getItemName(int pos) {
		return itemName.get(pos);
	}
	
	public int getItemPrice(int pos) {
		return itemPrice.get(pos);
	}
	
	public int getItemQuantity(int pos) {
		return itemQuantity.get(pos);
	}
	
	public int getSize() {
		return itemName.size();
	}
	
	
	
	
	
}
