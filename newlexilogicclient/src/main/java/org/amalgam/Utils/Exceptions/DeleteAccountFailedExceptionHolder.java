package org.amalgam.Utils.Exceptions;

/**
* org/amalgam/Utils/Exceptions/DeleteAccountFailedExceptionHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ProgramUtilities.idl
* Wednesday, May 15, 2024 6:06:35 PM SGT
*/

public final class DeleteAccountFailedExceptionHolder implements org.omg.CORBA.portable.Streamable
{
  public DeleteAccountFailedException value = null;

  public DeleteAccountFailedExceptionHolder ()
  {
  }

  public DeleteAccountFailedExceptionHolder (DeleteAccountFailedException initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = DeleteAccountFailedExceptionHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    DeleteAccountFailedExceptionHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return DeleteAccountFailedExceptionHelper.type ();
  }

}
