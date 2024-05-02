package org.amalgam.Service.Game.GameServicePackage;


/**
* org/amalgam/Service/Game/GameServicePackage/PlayerHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from GameService.idl
* Thursday, May 2, 2024 9:20:49 AM CST
*/

abstract public class PlayerHelper
{
  private static String  _id = "IDL:org/amalgam/Service/Game/GameService/Player:1.0";

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
  private static boolean __active = false;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      synchronized (org.omg.CORBA.TypeCode.class)
      {
        if (__typeCode == null)
        {
          if (__active)
          {
            return org.omg.CORBA.ORB.init().create_recursive_tc ( _id );
          }
          __active = true;
          org.omg.CORBA.StructMember[] _members0 = new org.omg.CORBA.StructMember [4];
          org.omg.CORBA.TypeCode _tcOf_members0 = null;
          _tcOf_members0 = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_long);
          _members0[0] = new org.omg.CORBA.StructMember (
            "id",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _members0[1] = new org.omg.CORBA.StructMember (
            "name",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _members0[2] = new org.omg.CORBA.StructMember (
            "password",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _members0[3] = new org.omg.CORBA.StructMember (
            "lastLogin",
            _tcOf_members0,
            null);
          __typeCode = org.omg.CORBA.ORB.init ().create_struct_tc (org.amalgam.Service.Game.GameServicePackage.PlayerHelper.id (), "Player", _members0);
          __active = false;
        }
      }
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static org.amalgam.Service.Game.GameServicePackage.Player read (org.omg.CORBA.portable.InputStream istream)
  {
    org.amalgam.Service.Game.GameServicePackage.Player value = new org.amalgam.Service.Game.GameServicePackage.Player ();
    value.id = istream.read_long ();
    value.name = istream.read_string ();
    value.password = istream.read_string ();
    value.lastLogin = istream.read_string ();
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, org.amalgam.Service.Game.GameServicePackage.Player value)
  {
    ostream.write_long (value.id);
    ostream.write_string (value.name);
    ostream.write_string (value.password);
    ostream.write_string (value.lastLogin);
  }

}
