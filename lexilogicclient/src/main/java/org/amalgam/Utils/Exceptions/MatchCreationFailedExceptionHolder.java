package org.amalgam.Utils.Exceptions;

/**
* org/amalgam/Utils/Exceptions/MatchCreationFailedExceptionHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ProgramUtilities.idl
* Wednesday, May 29, 2024 9:39:28 PM PST
*/

public final class MatchCreationFailedExceptionHolder implements org.omg.CORBA.portable.Streamable
{
  public MatchCreationFailedException value = null;

  public MatchCreationFailedExceptionHolder ()
  {
  }

  public MatchCreationFailedExceptionHolder (MatchCreationFailedException initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = MatchCreationFailedExceptionHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    MatchCreationFailedExceptionHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return MatchCreationFailedExceptionHelper.type ();
  }

}
