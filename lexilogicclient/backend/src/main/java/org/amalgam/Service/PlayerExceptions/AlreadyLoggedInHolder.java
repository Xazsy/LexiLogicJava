package org.amalgam.Service.PlayerExceptions;

/**
* org/amalgam/Service/PlayerExceptions/AlreadyLoggedInHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from PlayerService.idl
* Thursday, May 2, 2024 9:20:59 AM CST
*/

public final class AlreadyLoggedInHolder implements org.omg.CORBA.portable.Streamable
{
  public org.amalgam.Service.PlayerExceptions.AlreadyLoggedIn value = null;

  public AlreadyLoggedInHolder ()
  {
  }

  public AlreadyLoggedInHolder (org.amalgam.Service.PlayerExceptions.AlreadyLoggedIn initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = org.amalgam.Service.PlayerExceptions.AlreadyLoggedInHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    org.amalgam.Service.PlayerExceptions.AlreadyLoggedInHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return org.amalgam.Service.PlayerExceptions.AlreadyLoggedInHelper.type ();
  }

}
