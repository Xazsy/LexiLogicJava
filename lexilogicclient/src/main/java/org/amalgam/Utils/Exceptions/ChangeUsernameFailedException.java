package org.amalgam.Utils.Exceptions;


/**
* org/amalgam/Utils/Exceptions/ChangeUsernameFailedException.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ProgramUtilities.idl
* Monday, July 1, 2024 10:33:07 PM SGT
*/

public final class ChangeUsernameFailedException extends org.omg.CORBA.UserException
{
  public String message = null;

  public ChangeUsernameFailedException ()
  {
    super(ChangeUsernameFailedExceptionHelper.id());
  } // ctor

  public ChangeUsernameFailedException (String _message)
  {
    super(ChangeUsernameFailedExceptionHelper.id());
    message = _message;
  } // ctor


  public ChangeUsernameFailedException (String $reason, String _message)
  {
    super(ChangeUsernameFailedExceptionHelper.id() + "  " + $reason);
    message = _message;
  } // ctor

} // class ChangeUsernameFailedException
