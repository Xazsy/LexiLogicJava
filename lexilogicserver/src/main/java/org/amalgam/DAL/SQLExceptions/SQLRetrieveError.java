package org.amalgam.DAL.SQLExceptions;


/**
* org/amalgam/DAL/SQLExceptions/SQLRetrieveError.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from DataAccessLayer.idl
* Saturday, April 27, 2024 5:44:19 PM SGT
*/

public final class SQLRetrieveError extends org.omg.CORBA.UserException
{
  public String reason = null;

  public SQLRetrieveError ()
  {
    super(SQLRetrieveErrorHelper.id());
  } // ctor

  public SQLRetrieveError (String _reason)
  {
    super(SQLRetrieveErrorHelper.id());
    reason = _reason;
  } // ctor


  public SQLRetrieveError (String $reason, String _reason)
  {
    super(SQLRetrieveErrorHelper.id() + "  " + $reason);
    reason = _reason;
  } // ctor

} // class SQLRetrieveError
