package org.amalgam.Service.PlayerExceptions;

/**
* org/amalgam/Service/PlayerExceptions/ObjectExistenceHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from PlayerService.idl
* Saturday, April 27, 2024 5:35:22 PM SGT
*/

public final class ObjectExistenceHolder implements org.omg.CORBA.portable.Streamable
{
  public org.amalgam.Service.PlayerExceptions.ObjectExistence value = null;

  public ObjectExistenceHolder ()
  {
  }

  public ObjectExistenceHolder (org.amalgam.Service.PlayerExceptions.ObjectExistence initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = org.amalgam.Service.PlayerExceptions.ObjectExistenceHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    org.amalgam.Service.PlayerExceptions.ObjectExistenceHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return org.amalgam.Service.PlayerExceptions.ObjectExistenceHelper.type ();
  }

}
