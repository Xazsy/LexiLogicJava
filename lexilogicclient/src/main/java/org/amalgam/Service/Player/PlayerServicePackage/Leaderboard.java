package org.amalgam.Service.Player.PlayerServicePackage;


/**
* org/amalgam/Service/Player/PlayerServicePackage/Leaderboard.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from PlayerService.idl
* Saturday, April 27, 2024 5:35:22 PM SGT
*/

public final class Leaderboard implements org.omg.CORBA.portable.IDLEntity
{
  public int leaderboardID = (int)0;
  public int playerID = (int)0;
  public int totalPoints = (int)0;

  public Leaderboard ()
  {
  } // ctor

  public Leaderboard (int _leaderboardID, int _playerID, int _totalPoints)
  {
    leaderboardID = _leaderboardID;
    playerID = _playerID;
    totalPoints = _totalPoints;
  } // ctor

} // class Leaderboard
