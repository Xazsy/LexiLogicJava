package org.amalgam.DAL.DALPlayer.PlayerDALPackage;


/**
* org/amalgam/DAL/DALPlayer/PlayerDALPackage/PlayerHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from DataAccessLayer.idl
* Sunday, May 5, 2024 5:01:36 PM SGT
*/

abstract public class PlayerHelper
{
  private static String  _id = "IDL:org/amalgam/DAL/DALPlayer/PlayerDAL/Player:1.0";

  public static void insert (org.omg.CORBA.Any a, org.amalgam.Utils.Objects.Player that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static org.amalgam.Utils.Objects.Player extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.amalgam.Utils.Objects.PlayerHelper.type ();
      __typeCode = org.omg.CORBA.ORB.init ().create_alias_tc (org.amalgam.DAL.DALPlayer.PlayerDALPackage.PlayerHelper.id (), "Player", __typeCode);
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static org.amalgam.Utils.Objects.Player read (org.omg.CORBA.portable.InputStream istream)
  {
    org.amalgam.Utils.Objects.Player value = null;
    value = org.amalgam.Utils.Objects.PlayerHelper.read (istream);
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, org.amalgam.Utils.Objects.Player value)
  {
    org.amalgam.Utils.Objects.PlayerHelper.write (ostream, value);
  }

}
