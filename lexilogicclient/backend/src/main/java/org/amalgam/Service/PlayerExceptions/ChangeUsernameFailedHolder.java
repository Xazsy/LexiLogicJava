package org.amalgam.Service.PlayerExceptions;

/**
* org/amalgam/Service/PlayerExceptions/ChangeUsernameFailedHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from PlayerService.idl
* Thursday, May 2, 2024 9:20:59 AM CST
*/

public final class ChangeUsernameFailedHolder implements org.omg.CORBA.portable.Streamable
{
  public org.amalgam.Service.PlayerExceptions.ChangeUsernameFailed value = null;

  public ChangeUsernameFailedHolder ()
  {
  }

  public ChangeUsernameFailedHolder (org.amalgam.Service.PlayerExceptions.ChangeUsernameFailed initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = org.amalgam.Service.PlayerExceptions.ChangeUsernameFailedHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    org.amalgam.Service.PlayerExceptions.ChangeUsernameFailedHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return org.amalgam.Service.PlayerExceptions.ChangeUsernameFailedHelper.type ();
  }

}
