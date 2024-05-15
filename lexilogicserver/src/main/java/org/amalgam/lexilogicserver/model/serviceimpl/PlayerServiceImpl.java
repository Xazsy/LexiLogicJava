package org.amalgam.lexilogicserver.model.serviceimpl;


import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import org.amalgam.Service.PlayerServiceModule.PlayerServicePOA;
import org.amalgam.UIControllers.PlayerCallback;
import org.amalgam.Utils.Exceptions.*;
import org.amalgam.Utils.Exceptions.InGameException;
import org.amalgam.Utils.Exceptions.UserExistenceException;
import org.amalgam.lexilogicserver.model.DAL.GameDetailDAL;
import org.amalgam.lexilogicserver.model.DAL.LobbyDAL;
import org.amalgam.lexilogicserver.model.DAL.PlayerDAL;
import org.amalgam.lexilogicserver.model.utilities.referenceobjects.GameDetail;
import org.amalgam.lexilogicserver.model.utilities.referenceobjects.Lobby;
import org.amalgam.lexilogicserver.model.utilities.referenceobjects.Player;


import java.util.LinkedList;

public class PlayerServiceImpl extends PlayerServicePOA {
    LinkedList<PlayerCallback> playerSessions = new LinkedList<>();

    @Override
    public void login(PlayerCallback player_callback, String pasword) throws AlreadyLoggedInException, InvalidCredentialsException, UserExistenceException {
        for(PlayerCallback callback : playerSessions){
            if(callback.username().equals(player_callback.username())){
                throw new AlreadyLoggedInException("User "+player_callback.username()+" is already logged in");
            }
        }
        Player playerFromServer = PlayerDAL.getPlayerByUsername(player_callback.username());
        if(playerFromServer==null){
            throw new UserExistenceException("User does not exist");
        }
        if(playerFromServer.getPassword().equals(pasword)){
            playerSessions.add(player_callback);

        }else{
            throw new InvalidCredentialsException("Invalid credentials");
        }


    }

    @Override
    public void logout(String username) throws NotLoggedInException {

        for(PlayerCallback callback : playerSessions){
            String user = callback.username();
            if(user.equals(username)){
                playerSessions.remove(callback);
                return;
            }
        }

        throw new NotLoggedInException("User not logged in");

    }

    @Deprecated
    @Override
    public void createAccount(String username, String password) throws AccountCreationFailedException {
    }

    @Override
    public void changeUsername(String username, String newUsername) throws ChangeUsernameFailedException {
        PlayerDAL.updateUsername(PlayerDAL.getPlayerByUsername(username).getUserID() ,newUsername);
    }

    @Override
    public void changePassword(String username, String newPassword) throws ChangePasswordFailedException {
        PlayerDAL.updatePassword(PlayerDAL.getPlayerByUsername(username).getUserID(), newPassword);
    }

    @Override
    public void accountDeletionRequest(String username) throws DeleteAccountFailedException {
          PlayerDAL.markAccountForDeletion(username);
    }

    @Override
    public String getGameHistory(String username) throws GameHistoryUnavailableException, InGameException {
        LinkedList<GameDetail> details = GameDetailDAL.getGameDetailByPID(PlayerDAL.getPlayerByUsername(username).getUserID());
        LinkedList<Lobby> lobbies = new LinkedList<Lobby>();
        Gson gson = new Gson();
        for(GameDetail detail : details){
            lobbies.add(LobbyDAL.getLobbyByID(detail.getLobbyID()));
        }

        JsonObject rootObject = new JsonObject();
        rootObject.addProperty("object","lobby");
        JsonArray lobbyArray = new JsonArray();
        for(Lobby lobby : lobbies){
            JsonObject info = new JsonObject();
            info.addProperty("lobbyID",String.valueOf(lobby.getLobbyID()));
            info.addProperty("createdBy",lobby.getCreatedBy());
            info.addProperty("winner",lobby.getWinner());
            lobbyArray.add(info);
        }
        rootObject.add("lobby",lobbyArray);
        return gson.toJson(rootObject);
    }
}
