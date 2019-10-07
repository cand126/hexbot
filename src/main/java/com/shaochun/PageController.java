package com.shaochun;

import com.google.gson.Gson;
import javafx.fxml.FXML;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import json.HexBotResponse;
import org.apache.http.client.fluent.Request;

import java.io.IOException;

public class PageController {

    @FXML
    private VBox pageContainer;

    @FXML
    public void initialize() {
        changeBackgroundColor();
    }

    @FXML
    private void changeBackgroundColor() {
        pageContainer.setBackground(new Background(new BackgroundFill(getColorFromApi(), null, null)));
    }

    private Color getColorFromApi() {
        String response = null;
        try {
            response = Request.Get("https://api.noopschallenge.com/hexbot").execute().returnContent().asString();
        } catch (IOException e) {
            return Color.WHITE;
        }
        Gson gson = new Gson();
        HexBotResponse hexBotResponse = gson.fromJson(response, HexBotResponse.class);
        return Color.web(hexBotResponse.getColors().get(0).getValue());
    }
}
