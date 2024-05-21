package org.amalgam.client;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import org.amalgam.Service.GameServiceModule.GameService;
import org.amalgam.UIControllers.PlayerCallback;
import org.amalgam.backend.microservices.serverconnection.ORBConnection;
import org.amalgam.client.howtoplay.HowToPlayController;
import org.amalgam.client.leaderboards.LeaderboardsController;
import org.amalgam.client.leaderboards.LeaderboardsPanel;
import org.amalgam.client.loading.LoadingController;
import org.amalgam.client.login.LoginController;
import org.amalgam.client.mainmenu.MainMenuController;
import org.amalgam.client.matchhistory.MatchHistoryController;
import org.amalgam.client.profile.ProfileChangePassController;
import org.amalgam.client.profile.ProfileChangeUsernameController;
import org.amalgam.client.profile.ProfileController;
import org.amalgam.client.signup.SignUpController;
import org.omg.CORBA.ORBPackage.InvalidName;
import org.omg.PortableServer.POAManagerPackage.AdapterInactive;

import java.io.IOException;
import java.io.InputStream;

public class MainController {
    public Stage stage;

    /**
     * Controller and Panel Variables
     */
    public static LoginController loginController;
    public static AnchorPane loginPanel;

    public static SignUpController signUpController;
    public static AnchorPane signUpPanel;

    public static MatchHistoryController matchHistoryController;
    public static AnchorPane matchHistoryPanel;

    public static ProfileController profileController;
    public static AnchorPane profilePane;

    public static MainMenuController mainMenuController;
    public static AnchorPane mainMenuPane;

    public static ProfileChangeUsernameController profileChangeUsernameController;
    public static AnchorPane changeUsernamePane;

    public static ProfileChangePassController profileChangePassController;
    public static AnchorPane changePassPane;

    public static LoadingController loadingController;
    public static AnchorPane loadingPane;

    public static LeaderboardsController leaderboardsController;
    public static AnchorPane leaderboardsPane;

    public static HowToPlayController howToPlayController;
    public static AnchorPane howToPlayPane;


    public static ORBConnection orbConnection;

    public MainController() {
        orbConnection = new ORBConnection(2018, "192.168.1.15");
        try {
            orbConnection.start();
        } catch (InvalidName | AdapterInactive e) {
            throw new RuntimeException(e);
        }
	}
    /**
     * Loads and displays the login view.
     */
    public void loadLoginView() {
        try {
            Font.loadFont(getClass().getResourceAsStream("/org/amalgam/fonts/BowlbyOneSC.ttf"), 20);
            Font.loadFont(getClass().getResourceAsStream("/org/amalgam/fonts/Brygada1918.ttf"), 20);

            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/org/amalgam/client/views/login/login-view.fxml"));
            AnchorPane loginPane = fxmlLoader.load();

            InputStream inputStream = getClass().getResourceAsStream("/org/amalgam/icons/newLogo.png");
            if (inputStream != null) {
                Image image = new Image(inputStream);
                stage.getIcons().add(image);
            } else {
                System.err.println("Failed to load image: Logo.png");
            }

            Scene scene = new Scene(loginPane);

            if (stage == null) {
                throw new IllegalStateException("Stage is not set. Please set the stage before calling the panel.");
            }

            stage.setScene(scene);
            stage.setResizable(false);
            stage.setTitle("Lexi Logic");
            LoginController loginController = fxmlLoader.getController();
            loginController.setMainController(this);
            loginController.initialize();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Loads and displays the signup view.
     */
    public void loadSignUpView() {
        try {
            Font.loadFont(getClass().getResourceAsStream("/org/amalgam/fonts/BowlbyOneSC.ttf"), 20);
            Font.loadFont(getClass().getResourceAsStream("/org/amalgam/fonts/Brygada1918.ttf"), 20);

            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/org/amalgam/client/views/signup/signup-view.fxml"));
            AnchorPane signuppane = fxmlLoader.load();

            InputStream inputStream = getClass().getResourceAsStream("/org/amalgam/icons/Logo.png");

            if (inputStream != null) {
                Image image = new Image(inputStream);
                stage.getIcons().add(image);
            } else {
                System.err.println("Failed to load image: Logo.png");
            }

            Scene scene = new Scene(signuppane);

            if (stage == null) {
                throw new IllegalStateException("Stage is not set. Please set the stage before calling the panel.");
            }

            stage.setScene(scene);
            stage.setResizable(false);
            stage.setTitle("Lexi Logic");
            SignUpController signUpController = fxmlLoader.getController();
            signUpController.setMainController(this);
            signUpController.initialize();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Loads and displays the matchHistory view.
     */
    public void loadMatchHistoryView() {
        try {
            Font.loadFont(getClass().getResourceAsStream("/org/amalgam/fonts/BowlbyOneSC.ttf"), 20);
            Font.loadFont(getClass().getResourceAsStream("/org/amalgam/fonts/Brygada1918.ttf"), 20);

            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/org/amalgam/client/views/matchhistory/matchhistory-view.fxml"));
            AnchorPane matchHistoryPane = fxmlLoader.load();

            InputStream inputStream = getClass().getResourceAsStream("/org/amalgam/icons/newLogo.png");

            if (inputStream != null) {
                Image image = new Image(inputStream);
                stage.getIcons().add(image);
            } else {
                System.err.println("Failed to load image: Logo.png");
            }

            Scene scene = new Scene(matchHistoryPane);

            if (stage == null) {
                throw new IllegalStateException("Stage is not set. Please set the stage before calling the panel.");
            }

            stage.setScene(scene);
            stage.setResizable(false);
            stage.setTitle("Lexi Logic");
            MatchHistoryController matchHistoryController = fxmlLoader.getController();
            matchHistoryController.setMainController(this);
            matchHistoryController.initialize();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Loads and displays the profile view.
     */
    public void loadProfileView(){
        try {
            Font.loadFont(getClass().getResourceAsStream("/org/amalgam/fonts/BowlbyOneSC.ttf"), 20);
            Font.loadFont(getClass().getResourceAsStream("/org/amalgam/fonts/Brygada1918.ttf"), 20);

            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/org/amalgam/client/views/profile/profile-view.fxml"));
            AnchorPane profilePane = fxmlLoader.load();

            InputStream inputStream = getClass().getResourceAsStream("/org/amalgam/icons/newLogo.png");

            if (inputStream != null) {
                Image image = new Image(inputStream);
                stage.getIcons().add(image);
            } else {
                System.err.println("Failed to load image: Logo.png");
            }

            Scene scene = new Scene(profilePane);

            if (stage == null) {
                throw new IllegalStateException("Stage is not set. Please set the stage before calling the panel.");
            }

            stage.setScene(scene);
            stage.setResizable(false);
            stage.setTitle("Lexi Logic");
            ProfileController profileController = fxmlLoader.getController();
            profileController.setMainController(this);
            profileController.initialize();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Loads and displays the profileChangeUsername view.
     */
    public void loadProfileChangeUsernameView(){
        try {
            Font.loadFont(getClass().getResourceAsStream("/org/amalgam/fonts/BowlbyOneSC.ttf"), 20);
            Font.loadFont(getClass().getResourceAsStream("/org/amalgam/fonts/Brygada1918.ttf"), 20);

            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/org/amalgam/client/views/profile/profileChangeUsername-view.fxml"));
            AnchorPane changeUsernamePane = fxmlLoader.load();

            InputStream inputStream = getClass().getResourceAsStream("/org/amalgam/icons/newLogo.png");

            if (inputStream != null) {
                Image image = new Image(inputStream);
                stage.getIcons().add(image);
            } else {
                System.err.println("Failed to load image: Logo.png");
            }

            Scene scene = new Scene(changeUsernamePane);

            if (stage == null) {
                throw new IllegalStateException("Stage is not set. Please set the stage before calling the panel.");
            }

            stage.setScene(scene);
            stage.setResizable(false);
            stage.setTitle("Lexi Logic");
            ProfileChangeUsernameController profileChangeUsernameController = fxmlLoader.getController();
            profileChangeUsernameController.setMainController(this);
            profileChangeUsernameController.initialize();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Loads and displays the profileChangePassword view.
     */
    public void loadProfileChangePasswordView(){
        try {
            Font.loadFont(getClass().getResourceAsStream("/org/amalgam/fonts/BowlbyOneSC.ttf"), 20);
            Font.loadFont(getClass().getResourceAsStream("/org/amalgam/fonts/Brygada1918.ttf"), 20);

            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/org/amalgam/client/views/profile/profileChangePass-view.fxml"));
            AnchorPane changepassPane = fxmlLoader.load();

            InputStream inputStream = getClass().getResourceAsStream("/org/amalgam/icons/newLogo.png");

            if (inputStream != null) {
                Image image = new Image(inputStream);
                stage.getIcons().add(image);
            } else {
                System.err.println("Failed to load image: Logo.png");
            }

            Scene scene = new Scene(changepassPane);

            if (stage == null) {
                throw new IllegalStateException("Stage is not set. Please set the stage before calling the panel.");
            }

            stage.setScene(scene);
            stage.setResizable(false);
            stage.setTitle("Lexi Logic");
            ProfileChangePassController profileChangePassController = fxmlLoader.getController();
            profileChangePassController.setMainController(this);
            profileChangePassController.initialize();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Loads and displays the mainMenu view.
     */
    public void loadMainMenuView(){
        try {
            Font.loadFont(getClass().getResourceAsStream("/org/amalgam/fonts/BowlbyOneSC.ttf"), 20);
            Font.loadFont(getClass().getResourceAsStream("/org/amalgam/fonts/Brygada1918.ttf"), 20);

            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/org/amalgam/client/views/mainmenu/mainmenu-view.fxml"));
            AnchorPane mainmenuPane = fxmlLoader.load();

            InputStream inputStream = getClass().getResourceAsStream("/org/amalgam/icons/newLogo.png");

            if (inputStream != null) {
                Image image = new Image(inputStream);
                stage.getIcons().add(image);
            } else {
                System.err.println("Failed to load image: Logo.png");
            }

            Scene scene = new Scene(mainmenuPane);

            if (stage == null) {
                throw new IllegalStateException("Stage is not set. Please set the stage before calling the panel.");
            }

            stage.setScene(scene);
            stage.setResizable(false);
            stage.setTitle("Lexi Logic");
            MainMenuController mainMenuController = fxmlLoader.getController();
            mainMenuController.setMainController(this);
            mainMenuController.initialize();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Loads and displays the game view.
     */
    public void loadGameView(){
        try {
            Font.loadFont(getClass().getResourceAsStream("/org/amalgam/fonts/BowlbyOneSC.ttf"), 20);
            Font.loadFont(getClass().getResourceAsStream("/org/amalgam/fonts/Brygada1918.ttf"), 20);

            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/org/amalgam/client/views/game/game-view.fxml"));
            AnchorPane gamePane = fxmlLoader.load();

            InputStream inputStream = getClass().getResourceAsStream("/org/amalgam/icons/newLogo.png");

            if (inputStream != null) {
                Image image = new Image(inputStream);
                stage.getIcons().add(image);
            } else {
                System.err.println("Failed to load image: Logo.png");
            }

            Scene scene = new Scene(gamePane);

            if (stage == null) {
                throw new IllegalStateException("Stage is not set. Please set the stage before calling the panel.");
            }

            stage.setScene(scene);
            stage.setResizable(false);
            stage.setTitle("Lexi Logic");
            MainMenuController mainMenuController = fxmlLoader.getController();
            mainMenuController.setMainController(this);
            mainMenuController.initialize();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    /**
    Load and display the loading view
     */
    public void loadLoadingView(){
        try {
            Font.loadFont(getClass().getResourceAsStream("/org/amalgam/fonts/BowlbyOneSC.ttf"), 20);
            Font.loadFont(getClass().getResourceAsStream("/org/amalgam/fonts/Brygada1918.ttf"), 20);

            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/org/amalgam/client/views/loading/loading-view.fxml"));
            AnchorPane loadingPane = fxmlLoader.load();

            InputStream inputStream = getClass().getResourceAsStream("/org/amalgam/icons/newLogo.png");

            if (inputStream != null) {
                Image image = new Image(inputStream);
                stage.getIcons().add(image);
            } else {
                System.err.println("Failed to load image: Logo.png");
            }

            Scene scene = new Scene(loadingPane);

            if (stage == null) {
                throw new IllegalStateException("Stage is not set. Please set the stage before calling the panel.");
            }

            stage.setScene(scene);
            stage.setResizable(false);
            stage.setTitle("Lexi Logic");
            LoadingController loadingController = fxmlLoader.getController();
            loadingController.setMainController(this);
            loadingController.initialize();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Load and display leaderboards view
     */
    public void loadLeaderboardsView(){
        try {
            Font.loadFont(getClass().getResourceAsStream("/org/amalgam/fonts/BowlbyOneSC.ttf"), 20);
            Font.loadFont(getClass().getResourceAsStream("/org/amalgam/fonts/Brygada1918.ttf"), 20);

            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/org/amalgam/client/views/leaderboards/leaderboards-view.fxml"));
            AnchorPane leaderboardsPane = fxmlLoader.load();

            InputStream inputStream = getClass().getResourceAsStream("/org/amalgam/icons/newLogo.png");

            if (inputStream != null) {
                Image image = new Image(inputStream);
                stage.getIcons().add(image);
            } else {
                System.err.println("Failed to load image: Logo.png");
            }

            Scene scene = new Scene(leaderboardsPane);

            if (stage == null) {
                throw new IllegalStateException("Stage is not set. Please set the stage before calling the panel.");
            }

            stage.setScene(scene);
            stage.setResizable(false);
            stage.setTitle("Lexi Logic");
            LeaderboardsController leaderboardsController = fxmlLoader.getController();
            leaderboardsController.setMainController(this);
            leaderboardsController.initialize();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void loadHowToPlayView(){
        try {
            Font.loadFont(getClass().getResourceAsStream("/org/amalgam/fonts/BowlbyOneSC.ttf"), 20);
            Font.loadFont(getClass().getResourceAsStream("/org/amalgam/fonts/Brygada1918.ttf"), 20);

            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/org/amalgam/client/views/howtoplay/howtoplay-view.fxml"));
            AnchorPane howToPlayPane = fxmlLoader.load();

            InputStream inputStream = getClass().getResourceAsStream("/org/amalgam/icons/newLogo.png");

            if (inputStream != null) {
                Image image = new Image(inputStream);
                stage.getIcons().add(image);
            } else {
                System.err.println("Failed to load image: Logo.png");
            }

            Scene scene = new Scene(howToPlayPane);

            if (stage == null) {
                throw new IllegalStateException("Stage is not set. Please set the stage before calling the panel.");
            }

            stage.setScene(scene);
            stage.setResizable(false);
            stage.setTitle("Lexi Logic");
            HowToPlayController howToPlayController = fxmlLoader.getController();
            howToPlayController.setMainController(this);
            howToPlayController.initialize();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Getters and Setters of Controllers and Panels
     */
    public void setStage(Stage stage) { this.stage = stage;}
    public LoginController getLoginController() { return loginController; }
    public SignUpController getSignUpController() { return signUpController; }
    public MatchHistoryController getMatchHistoryController() { return matchHistoryController; }
    public ProfileController getProfileController(){ return profileController;}
    public ProfileChangeUsernameController getProfileChangeUsernameController(){ return profileChangeUsernameController;}
    public ProfileChangePassController getProfileChangePassController(){return profileChangePassController;}
    public MainMenuController getMainMenuController(){return mainMenuController;}
    public LoadingController getLoadingController(){return loadingController;}
    public LeaderboardsController getLeaderboardsController(){return leaderboardsController;}
    public HowToPlayController getHowToPlayController(){return howToPlayController;}
}