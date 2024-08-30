package application;

import javax.swing.JFrame;

import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

public class fxView extends JFrame {
	public fxView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1000,800);
		JFXPanel fxPanel = new JFXPanel();
		add(fxPanel);
		
		Platform.runLater(new Runnable() {
			
			@Override
			public void run() {
				initAndLoadWebView(fxPanel);
			}

		});
		setVisible(true);
	}
	
	private void initAndLoadWebView(JFXPanel fxPanel) {
		Group group = new Group();
		Scene scene = new Scene(group);
		fxPanel.setScene(scene);
		
		WebView webView = new WebView();
		group.getChildren().add(webView);
		webView.setMinSize(1000, 800);
		webView.setMaxSize(1000, 800);
		
		WebEngine webEngine = webView.getEngine();
		webEngine.load("http://google.com");
	}
	
	public static void main(String[] args) {
		new fxView();
	}
}
