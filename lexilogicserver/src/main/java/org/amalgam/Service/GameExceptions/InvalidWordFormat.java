package org.amalgam.Service.GameExceptions;


/**
* org/amalgam/Service/GameExceptions/InvalidWordFormat.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from GameService.idl
* Saturday, April 27, 2024 5:34:25 PM SGT
*/

public final class InvalidWordFormat extends org.omg.CORBA.UserException
{
  public String reason = null;

  public InvalidWordFormat ()
  {
    super(InvalidWordFormatHelper.id());
  } // ctor

  public InvalidWordFormat (String _reason)
  {
    super(InvalidWordFormatHelper.id());
    reason = _reason;
  } // ctor


  public InvalidWordFormat (String $reason, String _reason)
  {
    super(InvalidWordFormatHelper.id() + "  " + $reason);
    reason = _reason;
  } // ctor

} // class InvalidWordFormat
