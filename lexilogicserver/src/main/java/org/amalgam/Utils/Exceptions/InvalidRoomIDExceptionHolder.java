package org.amalgam.Utils.Exceptions;

/**
* org/amalgam/Utils/Exceptions/InvalidRoomIDExceptionHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ProgramUtilities.idl
* Wednesday, May 8, 2024 1:24:07 AM SGT
*/

public final class InvalidRoomIDExceptionHolder implements org.omg.CORBA.portable.Streamable
{
  public InvalidRoomIDException value = null;

  public InvalidRoomIDExceptionHolder ()
  {
  }

  public InvalidRoomIDExceptionHolder (InvalidRoomIDException initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = InvalidRoomIDExceptionHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    InvalidRoomIDExceptionHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return InvalidRoomIDExceptionHelper.type ();
  }

}
