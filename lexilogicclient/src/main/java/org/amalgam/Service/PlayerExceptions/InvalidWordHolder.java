package org.amalgam.Service.PlayerExceptions;

/**
* org/amalgam/Service/PlayerExceptions/InvalidWordHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from PlayerService.idl
* Saturday, April 27, 2024 5:35:22 PM SGT
*/

public final class InvalidWordHolder implements org.omg.CORBA.portable.Streamable
{
  public org.amalgam.Service.PlayerExceptions.InvalidWord value = null;

  public InvalidWordHolder ()
  {
  }

  public InvalidWordHolder (org.amalgam.Service.PlayerExceptions.InvalidWord initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = org.amalgam.Service.PlayerExceptions.InvalidWordHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    org.amalgam.Service.PlayerExceptions.InvalidWordHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return org.amalgam.Service.PlayerExceptions.InvalidWordHelper.type ();
  }

}
