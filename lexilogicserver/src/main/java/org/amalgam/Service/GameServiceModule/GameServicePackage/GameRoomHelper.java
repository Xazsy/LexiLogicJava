package org.amalgam.Service.GameServiceModule.GameServicePackage;


/**
* org/amalgam/Service/GameServiceModule/GameServicePackage/GameRoomHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from GameService.idl
* Wednesday, May 8, 2024 2:06:41 AM SGT
*/

abstract public class GameRoomHelper
{
  private static String  _id = "IDL:org/amalgam/Service/GameServiceModule/GameService/GameRoom:1.0";

  public static void insert (org.omg.CORBA.Any a, org.amalgam.Utils.Objects.GameRoom that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static org.amalgam.Utils.Objects.GameRoom extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.amalgam.Utils.Objects.GameRoomHelper.type ();
      __typeCode = org.omg.CORBA.ORB.init ().create_alias_tc (org.amalgam.Service.GameServiceModule.GameServicePackage.GameRoomHelper.id (), "GameRoom", __typeCode);
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static org.amalgam.Utils.Objects.GameRoom read (org.omg.CORBA.portable.InputStream istream)
  {
    org.amalgam.Utils.Objects.GameRoom value = null;
    value = org.amalgam.Utils.Objects.GameRoomHelper.read (istream);
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, org.amalgam.Utils.Objects.GameRoom value)
  {
    org.amalgam.Utils.Objects.GameRoomHelper.write (ostream, value);
  }

}
