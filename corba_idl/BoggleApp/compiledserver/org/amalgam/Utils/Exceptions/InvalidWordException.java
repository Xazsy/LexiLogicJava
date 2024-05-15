package org.amalgam.Utils.Exceptions;


/**
* org/amalgam/Utils/Exceptions/InvalidWordException.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ProgramUtilities.idl
* Thursday, May 16, 2024 1:07:05 AM PST
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
