package org.amalgam.Utils.Exceptions;

/**
* org/amalgam/Utils/Exceptions/GameHistoryUnavailableExceptionHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ProgramUtilities.idl
* Wednesday, May 8, 2024 1:24:07 AM SGT
*/

public final class GameHistoryUnavailableExceptionHolder implements org.omg.CORBA.portable.Streamable
{
  public GameHistoryUnavailableException value = null;

  public GameHistoryUnavailableExceptionHolder ()
  {
  }

  public GameHistoryUnavailableExceptionHolder (GameHistoryUnavailableException initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = GameHistoryUnavailableExceptionHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    GameHistoryUnavailableExceptionHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return GameHistoryUnavailableExceptionHelper.type ();
  }

}
