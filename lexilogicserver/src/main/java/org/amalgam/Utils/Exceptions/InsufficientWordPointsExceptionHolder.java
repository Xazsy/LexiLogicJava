package org.amalgam.Utils.Exceptions;

/**
* org/amalgam/Utils/Exceptions/InsufficientWordPointsExceptionHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ProgramUtilities.idl
* Monday, May 13, 2024 11:20:50 PM SGT
*/

public final class InsufficientWordPointsExceptionHolder implements org.omg.CORBA.portable.Streamable
{
  public InsufficientWordPointsException value = null;

  public InsufficientWordPointsExceptionHolder ()
  {
  }

  public InsufficientWordPointsExceptionHolder (InsufficientWordPointsException initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = InsufficientWordPointsExceptionHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    InsufficientWordPointsExceptionHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return InsufficientWordPointsExceptionHelper.type ();
  }

}
