package org.amalgam.Service.GameExceptions;


/**
* org/amalgam/Service/GameExceptions/WinnerDoesNotExist.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from GameService.idl
* Saturday, April 27, 2024 5:34:25 PM SGT
*/

public final class WinnerDoesNotExist extends org.omg.CORBA.UserException
{
  public String reason = null;

  public WinnerDoesNotExist ()
  {
    super(WinnerDoesNotExistHelper.id());
  } // ctor

  public WinnerDoesNotExist (String _reason)
  {
    super(WinnerDoesNotExistHelper.id());
    reason = _reason;
  } // ctor


  public WinnerDoesNotExist (String $reason, String _reason)
  {
    super(WinnerDoesNotExistHelper.id() + "  " + $reason);
    reason = _reason;
  } // ctor

} // class WinnerDoesNotExist
