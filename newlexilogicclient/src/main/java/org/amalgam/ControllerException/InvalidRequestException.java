package org.amalgam.ControllerException;


/**
* org/amalgam/ControllerException/InvalidRequestException.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from UIControllers.idl
* Monday, May 20, 2024 2:19:20 PM SGT
*/

public final class InvalidRequestException extends org.omg.CORBA.UserException
{
  public String message = null;

  public InvalidRequestException ()
  {
    super(InvalidRequestExceptionHelper.id());
  } // ctor

  public InvalidRequestException (String _message)
  {
    super(InvalidRequestExceptionHelper.id());
    message = _message;
  } // ctor


  public InvalidRequestException (String $reason, String _message)
  {
    super(InvalidRequestExceptionHelper.id() + "  " + $reason);
    message = _message;
  } // ctor

} // class InvalidRequestException
