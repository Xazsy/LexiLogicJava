package org.amalgam.DAL.DALPlayer;

/**
* org/amalgam/DAL/DALPlayer/PlayerDALHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from DataAccessLayer.idl
* Saturday, April 27, 2024 5:44:19 PM SGT
*/

public final class PlayerDALHolder implements org.omg.CORBA.portable.Streamable
{
  public org.amalgam.DAL.DALPlayer.PlayerDAL value = null;

  public PlayerDALHolder ()
  {
  }

  public PlayerDALHolder (org.amalgam.DAL.DALPlayer.PlayerDAL initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = org.amalgam.DAL.DALPlayer.PlayerDALHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    org.amalgam.DAL.DALPlayer.PlayerDALHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return org.amalgam.DAL.DALPlayer.PlayerDALHelper.type ();
  }

}
