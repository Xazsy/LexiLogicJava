package org.amalgam.Utils.Exceptions;


/**
* org/amalgam/Utils/Exceptions/CreatedByRetrievalException.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ProgramUtilities.idl
* Thursday, May 16, 2024 1:07:05 AM PST
*/

public final class CreatedByRetrievalException extends org.omg.CORBA.UserException
{
  public String message = null;

  public CreatedByRetrievalException ()
  {
    super(CreatedByRetrievalExceptionHelper.id());
  } // ctor

  public CreatedByRetrievalException (String _message)
  {
    super(CreatedByRetrievalExceptionHelper.id());
    message = _message;
  } // ctor


  public CreatedByRetrievalException (String $reason, String _message)
  {
    super(CreatedByRetrievalExceptionHelper.id() + "  " + $reason);
    message = _message;
  } // ctor

} // class CreatedByRetrievalException
