package controller;

import java.net.URL;
import java.util.ResourceBundle;

import application.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

public class AppController implements Initializable {
	
	@FXML
	private Button naver,google;
	
	@FXML
	private WebView webView;

	@SuppressWarnings("unused")
	private Main mainApp;

	private WebEngine webEngine = new WebEngine();
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
	//	webEngine = webView.getEngine();
		FXMLLoader loader = new FXMLLoader();  
		loader.setLocation(AppController.class.getResource("/application/App.fxml"));
		
	}

	public void naverView(ActionEvent ext) {
		System.out.println("naverViw");
		
//		WebView curview = new WebView();
//		webEngine.reload();
		
		webEngine = webView.getEngine();	
		webEngine.load("http://www.naver.com");
	}
	
	public void googleView(ActionEvent ext) {
//		System.out.println("googleViw");
//		WebView curview = new WebView();
//		WebEngine webEngine = curview.getEngine();
//		webEngine.load("http://google.com");
		webEngine = webView.getEngine();	
		webEngine.load("http://google.com");
	}
	
	public void setMainApp(Main mainApp) {
		this.mainApp = mainApp;
	}
}
