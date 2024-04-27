package org.amalgam.Service.GameExceptions;


/**
* org/amalgam/Service/GameExceptions/DuplicateWordException.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from GameService.idl
* Saturday, April 27, 2024 5:35:13 PM SGT
*/

public final class DuplicateWordException extends org.omg.CORBA.UserException
{
  public String reason = null;

  public DuplicateWordException ()
  {
    super(DuplicateWordExceptionHelper.id());
  } // ctor

  public DuplicateWordException (String _reason)
  {
    super(DuplicateWordExceptionHelper.id());
    reason = _reason;
  } // ctor


  public DuplicateWordException (String $reason, String _reason)
  {
    super(DuplicateWordExceptionHelper.id() + "  " + $reason);
    reason = _reason;
  } // ctor

} // class DuplicateWordException
