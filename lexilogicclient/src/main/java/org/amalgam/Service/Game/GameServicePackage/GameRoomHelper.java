package org.amalgam.Service.Game.GameServicePackage;


/**
* org/amalgam/Service/Game/GameServicePackage/GameRoomHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from GameService.idl
* Saturday, April 27, 2024 5:35:13 PM SGT
*/

abstract public class GameRoomHelper
{
  private static String  _id = "IDL:org/amalgam/Service/Game/GameService/GameRoom:1.0";

  public static void insert (org.omg.CORBA.Any a, org.amalgam.Service.Game.GameServicePackage.GameRoom that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static org.amalgam.Service.Game.GameServicePackage.GameRoom extract (org.omg.CORBA.Any a)
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
          org.omg.CORBA.StructMember[] _members0 = new org.omg.CORBA.StructMember [2];
          org.omg.CORBA.TypeCode _tcOf_members0 = null;
          _tcOf_members0 = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_long);
          _members0[0] = new org.omg.CORBA.StructMember (
            "roomID",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_sequence_tc (0, _tcOf_members0);
          _members0[1] = new org.omg.CORBA.StructMember (
            "players",
            _tcOf_members0,
            null);
          __typeCode = org.omg.CORBA.ORB.init ().create_struct_tc (org.amalgam.Service.Game.GameServicePackage.GameRoomHelper.id (), "GameRoom", _members0);
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

  public static org.amalgam.Service.Game.GameServicePackage.GameRoom read (org.omg.CORBA.portable.InputStream istream)
  {
    org.amalgam.Service.Game.GameServicePackage.GameRoom value = new org.amalgam.Service.Game.GameServicePackage.GameRoom ();
    value.roomID = istream.read_long ();
    int _len0 = istream.read_long ();
    value.players = new String[_len0];
    for (int _o1 = 0;_o1 < value.players.length; ++_o1)
      value.players[_o1] = istream.read_string ();
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, org.amalgam.Service.Game.GameServicePackage.GameRoom value)
  {
    ostream.write_long (value.roomID);
    ostream.write_long (value.players.length);
    for (int _i0 = 0;_i0 < value.players.length; ++_i0)
      ostream.write_string (value.players[_i0]);
  }

}
