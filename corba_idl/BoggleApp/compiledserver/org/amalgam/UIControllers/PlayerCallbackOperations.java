package org.amalgam.UIControllers;


/**
* org/amalgam/UIControllers/PlayerCallbackOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from UIControllers.idl
* Thursday, May 16, 2024 1:07:10 AM PST
*/

public interface PlayerCallbackOperations 
{
  String username ();
  void username (String newUsername);
  void uiCall (String jsonString) throws org.amalgam.ControllerException.InvalidRequestException;
} // interface PlayerCallbackOperations
