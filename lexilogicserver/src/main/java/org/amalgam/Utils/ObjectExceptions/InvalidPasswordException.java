package org.amalgam.Utils.ObjectExceptions;


/**
* org/amalgam/Utils/ObjectExceptions/InvalidPasswordException.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ProgramObjects.idl
* Friday, May 3, 2024 11:32:16 PM SGT
*/

public final class InvalidPasswordException extends org.omg.CORBA.UserException
{
  public String reason = null;

  public InvalidPasswordException ()
  {
    super(InvalidPasswordExceptionHelper.id());
  } // ctor

  public InvalidPasswordException (String _reason)
  {
    super(InvalidPasswordExceptionHelper.id());
    reason = _reason;
  } // ctor


  public InvalidPasswordException (String $reason, String _reason)
  {
    super(InvalidPasswordExceptionHelper.id() + "  " + $reason);
    reason = _reason;
  } // ctor

} // class InvalidPasswordException
