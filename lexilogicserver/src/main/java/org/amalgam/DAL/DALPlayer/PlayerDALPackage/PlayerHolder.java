package org.amalgam.DAL.DALPlayer.PlayerDALPackage;

/**
* org/amalgam/DAL/DALPlayer/PlayerDALPackage/PlayerHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from DataAccessLayer.idl
* Saturday, April 27, 2024 5:44:19 PM SGT
*/

public final class PlayerHolder implements org.omg.CORBA.portable.Streamable
{
  public org.amalgam.DAL.DALPlayer.PlayerDALPackage.Player value = null;

  public PlayerHolder ()
  {
  }

  public PlayerHolder (org.amalgam.DAL.DALPlayer.PlayerDALPackage.Player initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = org.amalgam.DAL.DALPlayer.PlayerDALPackage.PlayerHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    org.amalgam.DAL.DALPlayer.PlayerDALPackage.PlayerHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return org.amalgam.DAL.DALPlayer.PlayerDALPackage.PlayerHelper.type ();
  }

}
