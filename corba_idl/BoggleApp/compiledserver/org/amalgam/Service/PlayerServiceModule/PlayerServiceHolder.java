package org.amalgam.Service.PlayerServiceModule;

/**
* org/amalgam/Service/PlayerServiceModule/PlayerServiceHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from PlayerService.idl
* Thursday, May 16, 2024 1:07:04 AM PST
*/

public final class PlayerServiceHolder implements org.omg.CORBA.portable.Streamable
{
  public org.amalgam.Service.PlayerServiceModule.PlayerService value = null;

  public PlayerServiceHolder ()
  {
  }

  public PlayerServiceHolder (org.amalgam.Service.PlayerServiceModule.PlayerService initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = org.amalgam.Service.PlayerServiceModule.PlayerServiceHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    org.amalgam.Service.PlayerServiceModule.PlayerServiceHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return org.amalgam.Service.PlayerServiceModule.PlayerServiceHelper.type ();
  }

}
