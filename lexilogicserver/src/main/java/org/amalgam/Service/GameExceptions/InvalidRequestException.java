package org.amalgam.Service.GameExceptions;


/**
* org/amalgam/Service/GameExceptions/InvalidRequestException.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from GameService.idl
* Saturday, April 27, 2024 5:34:25 PM SGT
*/

public final class InvalidRequestException extends org.omg.CORBA.UserException
{
  public String reason = null;

  public InvalidRequestException ()
  {
    super(InvalidRequestExceptionHelper.id());
  } // ctor

  public InvalidRequestException (String _reason)
  {
    super(InvalidRequestExceptionHelper.id());
    reason = _reason;
  } // ctor


  public InvalidRequestException (String $reason, String _reason)
  {
    super(InvalidRequestExceptionHelper.id() + "  " + $reason);
    reason = _reason;
  } // ctor

} // class InvalidRequestException
