package org.amalgam.Utils.Exceptions;


/**
* org/amalgam/Utils/Exceptions/PlayerDoesNotExistException.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ProgramUtilities.idl
* Monday, July 1, 2024 10:33:08 PM SGT
*/

public final class PlayerDoesNotExistException extends org.omg.CORBA.UserException
{
  public String message = null;

  public PlayerDoesNotExistException ()
  {
    super(PlayerDoesNotExistExceptionHelper.id());
  } // ctor

  public PlayerDoesNotExistException (String _message)
  {
    super(PlayerDoesNotExistExceptionHelper.id());
    message = _message;
  } // ctor


  public PlayerDoesNotExistException (String $reason, String _message)
  {
    super(PlayerDoesNotExistExceptionHelper.id() + "  " + $reason);
    message = _message;
  } // ctor

} // class PlayerDoesNotExistException
