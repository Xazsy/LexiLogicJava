package org.amalgam.Utils.Exceptions;


/**
* org/amalgam/Utils/Exceptions/InGameException.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ProgramUtilities.idl
* Monday, May 20, 2024 3:01:31 PM PST
*/

public final class InGameException extends org.omg.CORBA.UserException
{
  public String message = null;

  public InGameException ()
  {
    super(InGameExceptionHelper.id());
  } // ctor

  public InGameException (String _message)
  {
    super(InGameExceptionHelper.id());
    message = _message;
  } // ctor


  public InGameException (String $reason, String _message)
  {
    super(InGameExceptionHelper.id() + "  " + $reason);
    message = _message;
  } // ctor

} // class InGameException
