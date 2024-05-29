package org.amalgam.Utils.Exceptions;


/**
* org/amalgam/Utils/Exceptions/NoPlayersAvailableException.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ProgramUtilities.idl
* Wednesday, May 29, 2024 9:39:28 PM PST
*/

public final class NoPlayersAvailableException extends org.omg.CORBA.UserException
{
  public String message = null;

  public NoPlayersAvailableException ()
  {
    super(NoPlayersAvailableExceptionHelper.id());
  } // ctor

  public NoPlayersAvailableException (String _message)
  {
    super(NoPlayersAvailableExceptionHelper.id());
    message = _message;
  } // ctor


  public NoPlayersAvailableException (String $reason, String _message)
  {
    super(NoPlayersAvailableExceptionHelper.id() + "  " + $reason);
    message = _message;
  } // ctor

} // class NoPlayersAvailableException
