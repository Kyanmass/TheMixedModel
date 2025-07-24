import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;



public class Main extends Application {

    static final int WIDTH = 1920;
    static final int HEIGHT = 1080;

    static final String FINAL_PASSWORD_ONE = "6-46355";
    static final String FINAL_PASSWORD_TWO = "";
    static final String FINAL_PASSWORD_THREE = "";
    static final String FINAL_PASSWORD_FOUR = "";
    static final String FINAL_PASSWORD_FIVE = "";

    static final Rectangle BG = new Rectangle(1920, 1080, Color.BLACK);


    public static void main(String[] args) {
	launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {



        AnchorPane rootMain = new AnchorPane();
        AnchorPane rootMotivation = new AnchorPane();

        Scene scene = new Scene(rootMain, WIDTH, HEIGHT, Color.BLACK);

        //rootMotivation

        TextField insertPasswordOneTexField = new TextField();
        insertPasswordOneTexField.setPrefSize(300, 50);
        insertPasswordOneTexField.setLayoutX(810);
        insertPasswordOneTexField.setLayoutY(515);
        insertPasswordOneTexField.setOpacity(0.1);
        rootMotivation.getChildren().addAll(BG, insertPasswordOneTexField);

        BG.setFill(Color.BLACK);

        insertPasswordOneTexField.setOnKeyPressed(event -> {

            if (event.getCode() == KeyCode.ENTER){

                if (insertPasswordOneTexField.getText().equals(FINAL_PASSWORD_ONE)){

                    rootMotivation.getChildren().remove(insertPasswordOneTexField);

                    ImageView imageViewIceberg = new ImageView();
                    imageViewIceberg.setImage(new Image(("file:iceberg.jpg")));

                    rootMotivation.getChildren().add(imageViewIceberg);

                    TextField protectTextfield = new TextField();
                    protectTextfield.setPrefSize(300, 50);
                    protectTextfield.setLayoutX(340);
                    protectTextfield.setLayoutY(515);
                    protectTextfield.setOpacity(0.1);

                    TextField surviveTextfield = new TextField();
                    surviveTextfield.setPrefSize(300, 50);
                    surviveTextfield.setLayoutX(1280);
                    surviveTextfield.setLayoutY(515);
                    surviveTextfield.setOpacity(0.1);


                    rootMotivation.getChildren().addAll(protectTextfield, surviveTextfield);

                    scene.setOnKeyPressed(protSurvEvent -> {

                        if (protSurvEvent.getCode() == KeyCode.ENTER){

                            if (protectTextfield.getText().equalsIgnoreCase("protect") && surviveTextfield.getText().equalsIgnoreCase("survive")) {

                                rootMotivation.getChildren().removeAll(protectTextfield, surviveTextfield, imageViewIceberg);

                                ImageView imageViewGlobalTemp = new ImageView();
                                imageViewGlobalTemp.setImage(new Image(("file:GlobalTemp.png")));
                                imageViewGlobalTemp.setPreserveRatio(true);
                                imageViewGlobalTemp.setFitHeight(900);
                                imageViewGlobalTemp.setY(90);
                                imageViewGlobalTemp.setX(240);

                                rootMotivation.getChildren().add(imageViewGlobalTemp);

                                scene.setOnKeyPressed(backEvent -> {

                                    if (backEvent.getCode() == KeyCode.BACK_SPACE){

                                        scene.setRoot(rootMain);

                                    }

                                });


                            }
                        }

                    });

                }

            }
        });



        //rootMain



        Image motivationEntrance = new Image("file:Motivation.png");
        Image empathyEntrance = new Image("file:Empathy.png");
        Image socialSkillEntrance = new Image("file:SocialSkill.png");
        Image selfRegulationEntrance = new Image("file:Self-Regulation.png");
        Image selfAwarenessEntrance = new Image("file:Self-Awareness.png");
        Image unknownEntrance = new Image("file:unknown.png");

        ImageView imageViewOne = new ImageView();
        ImageView imageViewTwo = new ImageView();
        ImageView imageViewThree = new ImageView();
        ImageView imageViewFour = new ImageView();
        ImageView imageViewFive = new ImageView();


        imageViewOne.setImage(motivationEntrance);
        imageViewTwo.setImage(unknownEntrance);
        imageViewThree.setImage(unknownEntrance);
        imageViewFour.setImage(unknownEntrance);
        imageViewFive.setImage(unknownEntrance);

        rootMain.getChildren().addAll(BG, imageViewOne, imageViewTwo, imageViewThree, imageViewFour, imageViewFive);

        imageViewOne.setPreserveRatio(true);
        imageViewOne.setFitWidth(500);

        imageViewOne.setY(290);
        imageViewOne.setX(210);

        imageViewOne.setOnMouseClicked(event -> {

            scene.setRoot(rootMotivation);
        });


        imageViewTwo.setPreserveRatio(true);
        imageViewTwo.setFitWidth(500);

        imageViewTwo.setY(290);
        imageViewTwo.setX(710);


        imageViewThree.setPreserveRatio(true);
        imageViewThree.setFitWidth(500);

        imageViewThree.setY(290);
        imageViewThree.setX(1210);


        imageViewFour.setPreserveRatio(true);
        imageViewFour.setFitWidth(500);

        imageViewFour.setY(580);
        imageViewFour.setX(460);


        imageViewFive.setPreserveRatio(true);
        imageViewFive.setFitWidth(500);

        imageViewFive.setY(580);
        imageViewFive.setX(960);


        primaryStage.setScene(scene);
        primaryStage.setTitle("The Mixed Model");
        primaryStage.show();



    }



}
