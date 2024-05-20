package org.amalgam.Utils.Exceptions;


/**
* org/amalgam/Utils/Exceptions/InvalidCredentialsException.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ProgramUtilities.idl
* Monday, May 20, 2024 2:19:20 PM SGT
*/

public final class InvalidCredentialsException extends org.omg.CORBA.UserException
{
  public String message = null;

  public InvalidCredentialsException ()
  {
    super(InvalidCredentialsExceptionHelper.id());
  } // ctor

  public InvalidCredentialsException (String _message)
  {
    super(InvalidCredentialsExceptionHelper.id());
    message = _message;
  } // ctor


  public InvalidCredentialsException (String $reason, String _message)
  {
    super(InvalidCredentialsExceptionHelper.id() + "  " + $reason);
    message = _message;
  } // ctor

} // class InvalidCredentialsException
