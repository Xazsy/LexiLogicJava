package org.amalgam.Utils.Exceptions;

/**
* org/amalgam/Utils/Exceptions/InGameExceptionHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ProgramUtilities.idl
* Thursday, May 9, 2024 1:16:39 PM SGT
*/

public final class InGameExceptionHolder implements org.omg.CORBA.portable.Streamable
{
  public InGameException value = null;

  public InGameExceptionHolder ()
  {
  }

  public InGameExceptionHolder (InGameException initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = InGameExceptionHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    InGameExceptionHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return InGameExceptionHelper.type ();
  }

}
