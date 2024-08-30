package application;
	
import java.io.IOException;

import controller.AppController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			//fxml 파일 가져오기
			System.out.println(getClass());
			System.out.println(getClass().getResource("App.fxml"));
//			FXMLLoader loader = new FXMLLoader(getClass().getResource("App.fxml")); 
//			Parent form = loader.load();
//			Scene scene = new Scene(form);
//			primaryStage.setTitle("브라우저뷰");
//			primaryStage.setScene(scene);
//			primaryStage.show();

			Parent form = FXMLLoader.load(getClass().getResource("App.fxml"));
			Scene scene = new Scene(form,1500,1000);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setTitle("브라우저뷰");
			primaryStage.setScene(scene);
			primaryStage.show();
			
//			FXMLLoader loader = new FXMLLoader();
//			AppController appc = loader.getController();
//			appc.setMainApp(this);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
