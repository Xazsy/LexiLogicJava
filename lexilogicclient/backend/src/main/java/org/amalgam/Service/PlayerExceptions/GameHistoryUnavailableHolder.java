package org.amalgam.Service.PlayerExceptions;

/**
* org/amalgam/Service/PlayerExceptions/GameHistoryUnavailableHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from PlayerService.idl
* Thursday, May 2, 2024 9:20:59 AM CST
*/

public final class GameHistoryUnavailableHolder implements org.omg.CORBA.portable.Streamable
{
  public org.amalgam.Service.PlayerExceptions.GameHistoryUnavailable value = null;

  public GameHistoryUnavailableHolder ()
  {
  }

  public GameHistoryUnavailableHolder (org.amalgam.Service.PlayerExceptions.GameHistoryUnavailable initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = org.amalgam.Service.PlayerExceptions.GameHistoryUnavailableHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    org.amalgam.Service.PlayerExceptions.GameHistoryUnavailableHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return org.amalgam.Service.PlayerExceptions.GameHistoryUnavailableHelper.type ();
  }

}
