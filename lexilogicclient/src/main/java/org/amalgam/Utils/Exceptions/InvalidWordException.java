package org.amalgam.Utils.Exceptions;


/**
* org/amalgam/Utils/Exceptions/InvalidWordException.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ProgramUtilities.idl
* Monday, July 1, 2024 10:33:07 PM SGT
*/

public final class InvalidWordException extends org.omg.CORBA.UserException
{
  public String message = null;

  public InvalidWordException ()
  {
    super(InvalidWordExceptionHelper.id());
  } // ctor

  public InvalidWordException (String _message)
  {
    super(InvalidWordExceptionHelper.id());
    message = _message;
  } // ctor


  public InvalidWordException (String $reason, String _message)
  {
    super(InvalidWordExceptionHelper.id() + "  " + $reason);
    message = _message;
  } // ctor

} // class InvalidWordException
