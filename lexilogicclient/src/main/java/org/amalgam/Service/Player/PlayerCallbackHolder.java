package org.amalgam.Service.Player;

/**
* org/amalgam/Service/Player/PlayerCallbackHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from PlayerService.idl
* Monday, April 29, 2024 7:32:02 PM SGT
*/

public final class PlayerCallbackHolder implements org.omg.CORBA.portable.Streamable
{
  public org.amalgam.Service.Player.PlayerCallback value = null;

  public PlayerCallbackHolder ()
  {
  }

  public PlayerCallbackHolder (org.amalgam.Service.Player.PlayerCallback initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = org.amalgam.Service.Player.PlayerCallbackHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    org.amalgam.Service.Player.PlayerCallbackHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return org.amalgam.Service.Player.PlayerCallbackHelper.type ();
  }

}
