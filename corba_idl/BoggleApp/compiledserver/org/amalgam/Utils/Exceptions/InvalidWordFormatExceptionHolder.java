package org.amalgam.Utils.Exceptions;

/**
* org/amalgam/Utils/Exceptions/InvalidWordFormatExceptionHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ProgramUtilities.idl
* Thursday, May 16, 2024 1:07:05 AM PST
*/

public final class InvalidWordFormatExceptionHolder implements org.omg.CORBA.portable.Streamable
{
  public org.amalgam.Utils.Exceptions.InvalidWordFormatException value = null;

  public InvalidWordFormatExceptionHolder ()
  {
  }

  public InvalidWordFormatExceptionHolder (org.amalgam.Utils.Exceptions.InvalidWordFormatException initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = org.amalgam.Utils.Exceptions.InvalidWordFormatExceptionHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    org.amalgam.Utils.Exceptions.InvalidWordFormatExceptionHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return org.amalgam.Utils.Exceptions.InvalidWordFormatExceptionHelper.type ();
  }

}
