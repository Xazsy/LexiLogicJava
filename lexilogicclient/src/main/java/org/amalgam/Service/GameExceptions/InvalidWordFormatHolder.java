package org.amalgam.Service.GameExceptions;

/**
* org/amalgam/Service/GameExceptions/InvalidWordFormatHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from GameService.idl
* Saturday, April 27, 2024 5:35:13 PM SGT
*/

public final class InvalidWordFormatHolder implements org.omg.CORBA.portable.Streamable
{
  public org.amalgam.Service.GameExceptions.InvalidWordFormat value = null;

  public InvalidWordFormatHolder ()
  {
  }

  public InvalidWordFormatHolder (org.amalgam.Service.GameExceptions.InvalidWordFormat initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = org.amalgam.Service.GameExceptions.InvalidWordFormatHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    org.amalgam.Service.GameExceptions.InvalidWordFormatHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return org.amalgam.Service.GameExceptions.InvalidWordFormatHelper.type ();
  }

}
