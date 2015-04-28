package application;

import java.text.SimpleDateFormat;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.*;

public class controller
{
	Integer Year = 2015;
	@FXML
	ComboBox<Integer> c1;
	@FXML
	Label month;
	@FXML
	ComboBox<Integer> c2;
	@FXML
	Label day;
	@FXML
	ComboBox<Integer> c3;
	@FXML
	Label year;
	
	public controller(){}
	@FXML
    private void initialize() {
		c1.getItems().addAll(1,2,3,4,5,6,7,8,9,10,11,12);
		c2.getItems().addAll(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30);
		c3.getItems().addAll(2010,2011,2012,2013,2014,2015,2016,2017,2018,2019,2020);
		
		
		
		month.setText("May");
		day.setText("1");
		year.setText("2015");
		
	}
	@FXML
	private void handleComboBox1Action() {
	  Integer month = c1.getSelectionModel().getSelectedItem();
	  String mont = "january";
	  Integer day = 31;
	  
	  switch(month){
	  case 1:
	  mont =  "January";
	  for(int i = c2.getItems().size();i<0;i--){
		  c2.getItems().remove(i);
	  }
	  c2.getItems().addAll(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31);
	  this.month.setText(mont);
	  break;
	  case 2:
	  mont =  "February";
	  this.month.setText(mont);
	  for(int i = c2.getItems().size();i<0;i--){
		  c2.getItems().remove(i);
	  }
      c2.getItems().addAll(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28);
	  
	  break;
	  case 3:
	  mont =  "March";
	  for(int i = c2.getItems().size();i<0;i--){
		  c2.getItems().remove(i);
	  }
	  c2.getItems().addAll(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31);
	  this.month.setText(mont);
	  break;
	  case 4:
	  mont =  "April";
	  this.month.setText(mont);
	  for(int i = c2.getItems().size();i<0;i--){
		  c2.getItems().remove(i);
	  }
	  c2.getItems().addAll(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30);
	  break;
	  case 5:
	  mont =  "May";
	  this.month.setText(mont);
	  for(int i = c2.getItems().size();i<0;i--){
		  c2.getItems().remove(i);
	  }
	  c2.getItems().addAll(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31);
	  break;
	  case 6:
	  mont =  "June";
	  this.month.setText(mont);
	  for(int i = c2.getItems().size();i<0;i--){
		  c2.getItems().remove(i);
	  }
	  c2.getItems().addAll(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30);
	  break;
	  case 7:
	  mont =  "July";
	  this.month.setText(mont);
	  for(int i = c2.getItems().size();i<0;i--){
		  c2.getItems().remove(i);
	  }
	  c2.getItems().addAll(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30);
	  break;
	  case 8:
	  mont =  "August";
	  this.month.setText(mont);
	  for(int i = c2.getItems().size();i<0;i--){
		  c2.getItems().remove(i);
	  }
	  c2.getItems().addAll(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31);
	  break;
	  case 9:
	  mont =  "September";
	  this.month.setText(mont);
	  for(int i = c2.getItems().size();i<0;i--){
		  c2.getItems().remove(i);
	  }
	  c2.getItems().addAll(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30);
	  break;
	  case 10:
	  mont =  "October";
	  this.month.setText(mont);
	  for(int i = c2.getItems().size();i<0;i--){
		  c2.getItems().remove(i);
	  }
	  c2.getItems().addAll(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31);
	  break;
	  case 11:
	  mont =  "November";
	  this.month.setText(mont);
	  for(int i = c2.getItems().size();i<0;i--){
		  c2.getItems().remove(i);
	  }
	  c2.getItems().addAll(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30);
	  break;
	  case 12:
	  mont =  "December";
	  this.month.setText(mont);
	  for(int i = c2.getItems().size();i<0;i--){
		  c2.getItems().remove(i);
	  }
	  c2.getItems().addAll(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31);
	  break;
	  }
	}

	@FXML
	private void handleComboBox2Action() {
		this.day.setText(c2.getSelectionModel().getSelectedItem().toString());
	}
	@FXML
	private void handleComboBox3Action() {
		this.year.setText(c3.getSelectionModel().getSelectedItem().toString());
		this.Year = c3.getSelectionModel().getSelectedItem();
		Integer month = c1.getSelectionModel().getSelectedItem();
		  String mont;
		  Integer day;
		  
		  switch(month){
		  case 1:
		  mont =  "January";
		  for(int i = c2.getItems().size();i<0;i--){
			  c2.getItems().remove(i);
		  }
		  c2.getItems().addAll(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31);
		  this.month.setText(mont);
		  break;
		  case 2:
		  mont =  "February";
		  this.month.setText(mont);
		  for(int i = c2.getItems().size();i<0;i--){
			  c2.getItems().remove(i);
		  }
		  c2.getItems().addAll(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28);
		  break;
		  case 3:
		  mont =  "March";
		  for(int i = c2.getItems().size();i<0;i--){
			  c2.getItems().remove(i);
		  }
		  c2.getItems().addAll(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31);
		  this.month.setText(mont);
		  break;
		  case 4:
		  mont =  "April";
		  this.month.setText(mont);
		  for(int i = c2.getItems().size();i<0;i--){
			  c2.getItems().remove(i);
		  }
		  c2.getItems().addAll(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30);
		  break;
		  case 5:
		  mont =  "May";
		  this.month.setText(mont);
		  for(int i = c2.getItems().size();i<0;i--){
			  c2.getItems().remove(i);
		  }
		  c2.getItems().addAll(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31);
		  break;
		  case 6:
		  mont =  "June";
		  this.month.setText(mont);
		  for(int i = c2.getItems().size();i<0;i--){
			  c2.getItems().remove(i);
		  }
		  c2.getItems().addAll(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30);
		  break;
		  case 7:
		  mont =  "July";
		  this.month.setText(mont);
		  for(int i = c2.getItems().size();i<0;i--){
			  c2.getItems().remove(i);
		  }
		  c2.getItems().addAll(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30);
		  break;
		  case 8:
		  mont =  "August";
		  this.month.setText(mont);
		  for(int i = c2.getItems().size();i<0;i--){
			  c2.getItems().remove(i);
		  }
		  c2.getItems().addAll(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31);
		  break;
		  case 9:
		  mont =  "September";
		  this.month.setText(mont);
		  for(int i = c2.getItems().size();i<0;i--){
			  c2.getItems().remove(i);
		  }
		  c2.getItems().addAll(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30);
		  break;
		  case 10:
		  mont =  "October";
		  this.month.setText(mont);
		  for(int i = c2.getItems().size();i<0;i--){
			  c2.getItems().remove(i);
		  }
		  c2.getItems().addAll(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31);
		  break;
		  case 11:
		  mont =  "November";
		  this.month.setText(mont);
		  for(int i = c2.getItems().size();i<0;i--){
			  c2.getItems().remove(i);
		  }
		  c2.getItems().addAll(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30);
		  break;
		  case 12:
		  mont =  "December";
		  this.month.setText(mont);
		  for(int i = c2.getItems().size();i<0;i--){
			  c2.getItems().remove(i);
		  }
		  c2.getItems().addAll(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31);
		  break;
		  }
		}
	}
	
		



