package org.amalgam.Utils.Exceptions;


/**
* org/amalgam/Utils/Exceptions/InvalidPasswordException.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ProgramUtilities.idl
* Wednesday, May 15, 2024 6:06:37 PM SGT
*/

public final class InvalidPasswordException extends org.omg.CORBA.UserException
{
  public String message = null;

  public InvalidPasswordException ()
  {
    super(InvalidPasswordExceptionHelper.id());
  } // ctor

  public InvalidPasswordException (String _message)
  {
    super(InvalidPasswordExceptionHelper.id());
    message = _message;
  } // ctor


  public InvalidPasswordException (String $reason, String _message)
  {
    super(InvalidPasswordExceptionHelper.id() + "  " + $reason);
    message = _message;
  } // ctor

} // class InvalidPasswordException
