package org.amalgam.Utils.Exceptions;


/**
* org/amalgam/Utils/Exceptions/PlayerListRetrievalException.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ProgramUtilities.idl
* Wednesday, May 8, 2024 1:24:07 AM SGT
*/

public final class PlayerListRetrievalException extends org.omg.CORBA.UserException
{
  public String message = null;

  public PlayerListRetrievalException ()
  {
    super(PlayerListRetrievalExceptionHelper.id());
  } // ctor

  public PlayerListRetrievalException (String _message)
  {
    super(PlayerListRetrievalExceptionHelper.id());
    message = _message;
  } // ctor


  public PlayerListRetrievalException (String $reason, String _message)
  {
    super(PlayerListRetrievalExceptionHelper.id() + "  " + $reason);
    message = _message;
  } // ctor

} // class PlayerListRetrievalException
