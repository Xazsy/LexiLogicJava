package org.amalgam.Service.Player.PlayerServicePackage;

/**
* org/amalgam/Service/Player/PlayerServicePackage/LeaderboardHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from PlayerService.idl
* Saturday, April 27, 2024 5:34:27 PM SGT
*/

public final class LeaderboardHolder implements org.omg.CORBA.portable.Streamable
{
  public org.amalgam.Service.Player.PlayerServicePackage.Leaderboard value = null;

  public LeaderboardHolder ()
  {
  }

  public LeaderboardHolder (org.amalgam.Service.Player.PlayerServicePackage.Leaderboard initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = org.amalgam.Service.Player.PlayerServicePackage.LeaderboardHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    org.amalgam.Service.Player.PlayerServicePackage.LeaderboardHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return org.amalgam.Service.Player.PlayerServicePackage.LeaderboardHelper.type ();
  }

}
