package org.amalgam.Utils.Objects;


/**
* org/amalgam/Utils/Objects/PlayerOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ProgramUtilities.idl
* Wednesday, May 8, 2024 1:24:07 AM SGT
*/

public interface PlayerOperations 
{
  int id ();
  void id (int newId);
  String name ();
  void name (String newName);
  String password ();
  void password (String newPassword);
  String lastLogin ();
  void lastLogin (String newLastLogin);
  void addPlayer (Player player) throws org.amalgam.Utils.Exceptions.DuplicatePlayerIDException, org.amalgam.Utils.Exceptions.InvalidPlayerDataException, org.amalgam.Utils.Exceptions.SQLError;
  void updateName (String newName) throws org.amalgam.Utils.Exceptions.InvalidNameException, org.amalgam.Utils.Exceptions.SQLError;
  void updatePassword (String newPassword) throws org.amalgam.Utils.Exceptions.InvalidPasswordException, org.amalgam.Utils.Exceptions.SQLError;
  void updateLastLogin (String newTime) throws org.amalgam.Utils.Exceptions.UpdateLastLoginException, org.amalgam.Utils.Exceptions.SQLError;
  void deletePlayer (int id) throws org.amalgam.Utils.Exceptions.PlayerDoesNotExistException;
} // interface PlayerOperations
