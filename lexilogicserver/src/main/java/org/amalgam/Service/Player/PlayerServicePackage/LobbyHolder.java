package org.amalgam.Service.Player.PlayerServicePackage;

/**
* org/amalgam/Service/Player/PlayerServicePackage/LobbyHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from PlayerService.idl
* Saturday, April 27, 2024 5:34:27 PM SGT
*/

public final class LobbyHolder implements org.omg.CORBA.portable.Streamable
{
  public org.amalgam.Service.Player.PlayerServicePackage.Lobby value = null;

  public LobbyHolder ()
  {
  }

  public LobbyHolder (org.amalgam.Service.Player.PlayerServicePackage.Lobby initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = org.amalgam.Service.Player.PlayerServicePackage.LobbyHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    org.amalgam.Service.Player.PlayerServicePackage.LobbyHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return org.amalgam.Service.Player.PlayerServicePackage.LobbyHelper.type ();
  }

}
