package org.amalgam.Service.PlayerExceptions;


/**
* org/amalgam/Service/PlayerExceptions/ChangePasswordFailed.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from PlayerService.idl
* Friday, May 3, 2024 11:29:23 PM SGT
*/

public final class ChangePasswordFailed extends org.omg.CORBA.UserException
{
  public String reason = null;

  public ChangePasswordFailed ()
  {
    super(ChangePasswordFailedHelper.id());
  } // ctor

  public ChangePasswordFailed (String _reason)
  {
    super(ChangePasswordFailedHelper.id());
    reason = _reason;
  } // ctor


  public ChangePasswordFailed (String $reason, String _reason)
  {
    super(ChangePasswordFailedHelper.id() + "  " + $reason);
    reason = _reason;
  } // ctor

} // class ChangePasswordFailed
