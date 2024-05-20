package org.amalgam.Utils.Exceptions;


/**
* org/amalgam/Utils/Exceptions/DuplicatePlayerIDException.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ProgramUtilities.idl
* Monday, May 20, 2024 2:19:21 PM SGT
*/

public final class DuplicatePlayerIDException extends org.omg.CORBA.UserException
{
  public String message = null;

  public DuplicatePlayerIDException ()
  {
    super(DuplicatePlayerIDExceptionHelper.id());
  } // ctor

  public DuplicatePlayerIDException (String _message)
  {
    super(DuplicatePlayerIDExceptionHelper.id());
    message = _message;
  } // ctor


  public DuplicatePlayerIDException (String $reason, String _message)
  {
    super(DuplicatePlayerIDExceptionHelper.id() + "  " + $reason);
    message = _message;
  } // ctor

} // class DuplicatePlayerIDException
