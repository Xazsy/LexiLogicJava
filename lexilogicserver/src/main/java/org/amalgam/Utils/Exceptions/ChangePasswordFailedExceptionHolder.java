package org.amalgam.Utils.Exceptions;

/**
* org/amalgam/Utils/Exceptions/ChangePasswordFailedExceptionHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ProgramUtilities.idl
* Wednesday, May 29, 2024 9:39:27 PM PST
*/

public final class ChangePasswordFailedExceptionHolder implements org.omg.CORBA.portable.Streamable
{
  public ChangePasswordFailedException value = null;

  public ChangePasswordFailedExceptionHolder ()
  {
  }

  public ChangePasswordFailedExceptionHolder (ChangePasswordFailedException initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = ChangePasswordFailedExceptionHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    ChangePasswordFailedExceptionHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return ChangePasswordFailedExceptionHelper.type ();
  }

}
