package main;

import gui.FreizeitbaederAnwendersystem;
//import gui.FreizeitbaederControl;
import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {
	
	@Override
	public void start(Stage primaryStage) {
		new FreizeitbaederAnwendersystem(primaryStage);
		//h
	}	
	
	public static void main(String[] args){
		launch(args);
	}
}
