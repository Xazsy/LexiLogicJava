package org.amalgam.Service.Player.PlayerServicePackage;

/**
* org/amalgam/Service/Player/PlayerServicePackage/GameRoomHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from PlayerService.idl
* Monday, April 29, 2024 7:32:02 PM SGT
*/

public final class GameRoomHolder implements org.omg.CORBA.portable.Streamable
{
  public org.amalgam.Service.Player.PlayerServicePackage.GameRoom value = null;

  public GameRoomHolder ()
  {
  }

  public GameRoomHolder (org.amalgam.Service.Player.PlayerServicePackage.GameRoom initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = org.amalgam.Service.Player.PlayerServicePackage.GameRoomHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    org.amalgam.Service.Player.PlayerServicePackage.GameRoomHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return org.amalgam.Service.Player.PlayerServicePackage.GameRoomHelper.type ();
  }

}
