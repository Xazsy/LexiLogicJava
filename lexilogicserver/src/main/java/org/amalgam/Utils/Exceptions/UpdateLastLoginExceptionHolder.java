package org.amalgam.Utils.Exceptions;

/**
* org/amalgam/Utils/Exceptions/UpdateLastLoginExceptionHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ProgramUtilities.idl
* Thursday, May 9, 2024 1:16:39 PM SGT
*/

public final class UpdateLastLoginExceptionHolder implements org.omg.CORBA.portable.Streamable
{
  public UpdateLastLoginException value = null;

  public UpdateLastLoginExceptionHolder ()
  {
  }

  public UpdateLastLoginExceptionHolder (UpdateLastLoginException initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = UpdateLastLoginExceptionHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    UpdateLastLoginExceptionHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return UpdateLastLoginExceptionHelper.type ();
  }

}
