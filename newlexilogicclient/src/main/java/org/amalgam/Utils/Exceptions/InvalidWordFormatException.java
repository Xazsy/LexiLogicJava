package org.amalgam.Utils.Exceptions;


/**
* org/amalgam/Utils/Exceptions/InvalidWordFormatException.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ProgramUtilities.idl
* Monday, May 13, 2024 11:16:59 PM SGT
*/

public final class InvalidWordFormatException extends org.omg.CORBA.UserException
{
  public String message = null;

  public InvalidWordFormatException ()
  {
    super(InvalidWordFormatExceptionHelper.id());
  } // ctor

  public InvalidWordFormatException (String _message)
  {
    super(InvalidWordFormatExceptionHelper.id());
    message = _message;
  } // ctor


  public InvalidWordFormatException (String $reason, String _message)
  {
    super(InvalidWordFormatExceptionHelper.id() + "  " + $reason);
    message = _message;
  } // ctor

} // class InvalidWordFormatException
