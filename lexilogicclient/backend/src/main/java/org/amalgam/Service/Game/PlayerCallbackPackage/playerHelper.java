package org.amalgam.Service.Game.PlayerCallbackPackage;


/**
* org/amalgam/Service/Game/PlayerCallbackPackage/playerHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from GameService.idl
* Thursday, May 2, 2024 9:20:49 AM CST
*/

abstract public class playerHelper
{
  private static String  _id = "IDL:org/amalgam/Service/Game/PlayerCallback/player:1.0";

  public static void insert (org.omg.CORBA.Any a, org.amalgam.Service.Game.GameServicePackage.Player that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static org.amalgam.Service.Game.GameServicePackage.Player extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.amalgam.Service.Game.GameServicePackage.PlayerHelper.type ();
      __typeCode = org.omg.CORBA.ORB.init ().create_alias_tc (org.amalgam.Service.Game.PlayerCallbackPackage.playerHelper.id (), "player", __typeCode);
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static org.amalgam.Service.Game.GameServicePackage.Player read (org.omg.CORBA.portable.InputStream istream)
  {
    org.amalgam.Service.Game.GameServicePackage.Player value = null;
    value = org.amalgam.Service.Game.GameServicePackage.PlayerHelper.read (istream);
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, org.amalgam.Service.Game.GameServicePackage.Player value)
  {
    org.amalgam.Service.Game.GameServicePackage.PlayerHelper.write (ostream, value);
  }

}
