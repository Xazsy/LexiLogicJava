package org.amalgam.Service.PlayerServiceModule;


/**
* org/amalgam/Service/PlayerServiceModule/PlayerServiceOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from PlayerService.idl
* Monday, May 20, 2024 2:19:18 PM SGT
*/

public interface PlayerServiceOperations 
{
  void login (org.amalgam.UIControllers.PlayerCallback player_callback, String password) throws org.amalgam.Utils.Exceptions.AlreadyLoggedInException, org.amalgam.Utils.Exceptions.InvalidCredentialsException, org.amalgam.Utils.Exceptions.UserExistenceException;
  void logout (String username) throws org.amalgam.Utils.Exceptions.NotLoggedInException;
  void createAccount (String username, String password) throws org.amalgam.Utils.Exceptions.AccountCreationFailedException;
  void changeUsername (String username, String newUsername) throws org.amalgam.Utils.Exceptions.ChangeUsernameFailedException;
  void changePassword (String username, String newPassword) throws org.amalgam.Utils.Exceptions.ChangePasswordFailedException;
  void accountDeletionRequest (String username) throws org.amalgam.Utils.Exceptions.DeleteAccountFailedException;
  String getGameHistory (String username) throws org.amalgam.Utils.Exceptions.GameHistoryUnavailableException, org.amalgam.Utils.Exceptions.InGameException;
} // interface PlayerServiceOperations
