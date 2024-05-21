package org.amalgam.lexilogicserver.model.handler.GameHandler;

import com.google.gson.JsonArray;
import org.amalgam.lexilogicserver.model.utilities.referenceobjects.PlayerGameDetail;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import java.util.LinkedHashMap;

public class GameRoomResponseBuilder {

    private static final Gson gson = new Gson();

    public static String buildGameStartedResponse(GameRoom gameRoom) {
        LinkedHashMap<String, PlayerGameDetail> details = gameRoom.getDetails();
        char[][] charMatrix = gameRoom.getCharMatrix();
        int roomID = gameRoom.getRoomID();

        JsonObject response = new JsonObject();
        response.addProperty("state", "game_started");
        response.addProperty("room_id", roomID);

        JsonArray matrixArray = new JsonArray();
        for (char[] row : charMatrix) {
            JsonArray rowArray = new JsonArray();
            for (char c : row) {
                rowArray.add(String.valueOf(c));
            }
            matrixArray.add(rowArray);
        }
        response.add("char_matrix", matrixArray);

        JsonObject gameRoomJson = new JsonObject();
        details.forEach((username, playerDetail) -> {
            JsonObject playerInfo = new JsonObject();
            playerInfo.addProperty("username", username);
            playerInfo.addProperty("points", playerDetail.getPoints());
            playerInfo.addProperty("ready", playerDetail.isReady());
            JsonArray wordsArray = new JsonArray();
            playerDetail.getWords().forEach(wordsArray::add);
            playerInfo.add("words", wordsArray);

            JsonArray dupedWordsArray = new JsonArray();
            playerDetail.getDupedWords().forEach(dupedWordsArray::add);
            playerInfo.add("duped_words", dupedWordsArray);

            gameRoomJson.add(username, playerInfo);
        });

        response.add("game_room", gameRoomJson);

        return response.toString();
    }


    public static String buildStagePlayersResponse(GameRoom gameRoom, int countdown) {
        LinkedHashMap<String, PlayerGameDetail> details = gameRoom.getDetails();
        char[][] charMatrix = gameRoom.getCharMatrix();
        int roomID = gameRoom.getRoomID();

        JsonObject response = new JsonObject();
        response.addProperty("state", "staging");
        response.addProperty("countdown", countdown);
        response.addProperty("room_id", roomID);

        JsonArray matrixArray = new JsonArray();
        for (char[] row : charMatrix) {
            JsonArray rowArray = new JsonArray();
            for (char c : row) {
                rowArray.add(String.valueOf(c));
            }
            matrixArray.add(rowArray);
        }
        response.add("char_matrix", matrixArray);

        JsonObject gameRoomJson = new JsonObject();
        details.forEach((username, playerDetail) -> {
            JsonObject playerInfo = new JsonObject();
            playerInfo.addProperty("username", username);
            playerInfo.addProperty("points", playerDetail.getPoints());
            playerInfo.addProperty("ready", playerDetail.isReady());

            JsonArray wordsArray = new JsonArray();
            playerDetail.getWords().forEach(wordsArray::add);
            playerInfo.add("words", wordsArray);

            JsonArray dupedWordsArray = new JsonArray();
            playerDetail.getDupedWords().forEach(dupedWordsArray::add);
            playerInfo.add("duped_words", dupedWordsArray);

            gameRoomJson.add(username, playerInfo);
        });

        response.add("game_room", gameRoomJson);

        return response.toString();
    }

    public static String buildWinnerResponse(String winner) {
        JsonObject response = new JsonObject();
        response.addProperty("state", "game_done");
        response.addProperty("winner", winner);
        return gson.toJson(response);
    }
}
