package org.amalgam.Service.PlayerExceptions;


/**
* org/amalgam/Service/PlayerExceptions/SubmitWordFailed.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from PlayerService.idl
* Saturday, April 27, 2024 5:34:27 PM SGT
*/

public final class SubmitWordFailed extends org.omg.CORBA.UserException
{
  public String reason = null;

  public SubmitWordFailed ()
  {
    super(SubmitWordFailedHelper.id());
  } // ctor

  public SubmitWordFailed (String _reason)
  {
    super(SubmitWordFailedHelper.id());
    reason = _reason;
  } // ctor


  public SubmitWordFailed (String $reason, String _reason)
  {
    super(SubmitWordFailedHelper.id() + "  " + $reason);
    reason = _reason;
  } // ctor

} // class SubmitWordFailed
