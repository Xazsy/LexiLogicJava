package org.amalgam.Utils.Exceptions;


/**
* org/amalgam/Utils/Exceptions/InvalidTotalPointsException.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ProgramUtilities.idl
* Wednesday, May 8, 2024 1:24:07 AM SGT
*/

public final class InvalidTotalPointsException extends org.omg.CORBA.UserException
{
  public String message = null;

  public InvalidTotalPointsException ()
  {
    super(InvalidTotalPointsExceptionHelper.id());
  } // ctor

  public InvalidTotalPointsException (String _message)
  {
    super(InvalidTotalPointsExceptionHelper.id());
    message = _message;
  } // ctor


  public InvalidTotalPointsException (String $reason, String _message)
  {
    super(InvalidTotalPointsExceptionHelper.id() + "  " + $reason);
    message = _message;
  } // ctor

} // class InvalidTotalPointsException
