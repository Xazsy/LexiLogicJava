package org.amalgam.Service.PlayerExceptions;

/**
* org/amalgam/Service/PlayerExceptions/ChangePasswordFailedHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from PlayerService.idl
* Thursday, May 2, 2024 9:20:59 AM CST
*/

public final class ChangePasswordFailedHolder implements org.omg.CORBA.portable.Streamable
{
  public org.amalgam.Service.PlayerExceptions.ChangePasswordFailed value = null;

  public ChangePasswordFailedHolder ()
  {
  }

  public ChangePasswordFailedHolder (org.amalgam.Service.PlayerExceptions.ChangePasswordFailed initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = org.amalgam.Service.PlayerExceptions.ChangePasswordFailedHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    org.amalgam.Service.PlayerExceptions.ChangePasswordFailedHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return org.amalgam.Service.PlayerExceptions.ChangePasswordFailedHelper.type ();
  }

}
