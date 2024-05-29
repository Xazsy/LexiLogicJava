package org.amalgam.Utils.Exceptions;


/**
* org/amalgam/Utils/Exceptions/InvalidRoomIDException.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ProgramUtilities.idl
* Wednesday, May 29, 2024 9:39:28 PM PST
*/

public final class InvalidRoomIDException extends org.omg.CORBA.UserException
{
  public String message = null;

  public InvalidRoomIDException ()
  {
    super(InvalidRoomIDExceptionHelper.id());
  } // ctor

  public InvalidRoomIDException (String _message)
  {
    super(InvalidRoomIDExceptionHelper.id());
    message = _message;
  } // ctor


  public InvalidRoomIDException (String $reason, String _message)
  {
    super(InvalidRoomIDExceptionHelper.id() + "  " + $reason);
    message = _message;
  } // ctor

} // class InvalidRoomIDException
