package org.amalgam.Utils.Exceptions;


/**
* org/amalgam/Utils/Exceptions/StartGameFailedException.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ProgramUtilities.idl
* Wednesday, May 29, 2024 9:39:27 PM PST
*/

public final class StartGameFailedException extends org.omg.CORBA.UserException
{
  public String message = null;

  public StartGameFailedException ()
  {
    super(StartGameFailedExceptionHelper.id());
  } // ctor

  public StartGameFailedException (String _message)
  {
    super(StartGameFailedExceptionHelper.id());
    message = _message;
  } // ctor


  public StartGameFailedException (String $reason, String _message)
  {
    super(StartGameFailedExceptionHelper.id() + "  " + $reason);
    message = _message;
  } // ctor

} // class StartGameFailedException
