package org.amalgam.Utils.Exceptions;

/**
* org/amalgam/Utils/Exceptions/InvalidPlayerDataExceptionHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ProgramUtilities.idl
* Monday, July 1, 2024 10:33:08 PM SGT
*/

public final class InvalidPlayerDataExceptionHolder implements org.omg.CORBA.portable.Streamable
{
  public InvalidPlayerDataException value = null;

  public InvalidPlayerDataExceptionHolder ()
  {
  }

  public InvalidPlayerDataExceptionHolder (InvalidPlayerDataException initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = InvalidPlayerDataExceptionHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    InvalidPlayerDataExceptionHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return InvalidPlayerDataExceptionHelper.type ();
  }

}
