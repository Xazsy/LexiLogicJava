package org.amalgam.Service.GameExceptions;


/**
* org/amalgam/Service/GameExceptions/EmptyLeaderBoard.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from GameService.idl
* Saturday, April 27, 2024 5:35:13 PM SGT
*/

public final class EmptyLeaderBoard extends org.omg.CORBA.UserException
{
  public String reason = null;

  public EmptyLeaderBoard ()
  {
    super(EmptyLeaderBoardHelper.id());
  } // ctor

  public EmptyLeaderBoard (String _reason)
  {
    super(EmptyLeaderBoardHelper.id());
    reason = _reason;
  } // ctor


  public EmptyLeaderBoard (String $reason, String _reason)
  {
    super(EmptyLeaderBoardHelper.id() + "  " + $reason);
    reason = _reason;
  } // ctor

} // class EmptyLeaderBoard
