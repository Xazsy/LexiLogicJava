package org.amalgam.DAL.SQLExceptions;


/**
* org/amalgam/DAL/SQLExceptions/SQLDeleteError.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from DataAccessLayer.idl
* Sunday, May 5, 2024 5:01:36 PM SGT
*/

public final class SQLDeleteError extends org.omg.CORBA.UserException
{
  public String reason = null;

  public SQLDeleteError ()
  {
    super(SQLDeleteErrorHelper.id());
  } // ctor

  public SQLDeleteError (String _reason)
  {
    super(SQLDeleteErrorHelper.id());
    reason = _reason;
  } // ctor


  public SQLDeleteError (String $reason, String _reason)
  {
    super(SQLDeleteErrorHelper.id() + "  " + $reason);
    reason = _reason;
  } // ctor

} // class SQLDeleteError
