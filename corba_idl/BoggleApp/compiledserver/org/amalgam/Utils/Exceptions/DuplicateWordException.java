package org.amalgam.Utils.Exceptions;


/**
* org/amalgam/Utils/Exceptions/DuplicateWordException.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ProgramUtilities.idl
* Thursday, May 16, 2024 1:07:05 AM PST
*/

public final class DuplicateWordException extends org.omg.CORBA.UserException
{
  public String message = null;

  public DuplicateWordException ()
  {
    super(DuplicateWordExceptionHelper.id());
  } // ctor

  public DuplicateWordException (String _message)
  {
    super(DuplicateWordExceptionHelper.id());
    message = _message;
  } // ctor


  public DuplicateWordException (String $reason, String _message)
  {
    super(DuplicateWordExceptionHelper.id() + "  " + $reason);
    message = _message;
  } // ctor

} // class DuplicateWordException
