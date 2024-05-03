package org.amalgam.Service.Player;


/**
* org/amalgam/Service/Player/PlayerServiceHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from PlayerService.idl
* Saturday, April 27, 2024 5:34:27 PM SGT
*/

abstract public class PlayerServiceHelper
{
  private static String  _id = "IDL:org/amalgam/Service/Player/PlayerService:1.0";

  public static void insert (org.omg.CORBA.Any a, org.amalgam.Service.Player.PlayerService that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static org.amalgam.Service.Player.PlayerService extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (org.amalgam.Service.Player.PlayerServiceHelper.id (), "PlayerService");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static org.amalgam.Service.Player.PlayerService read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_PlayerServiceStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, org.amalgam.Service.Player.PlayerService value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static org.amalgam.Service.Player.PlayerService narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof org.amalgam.Service.Player.PlayerService)
      return (org.amalgam.Service.Player.PlayerService)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      org.amalgam.Service.Player._PlayerServiceStub stub = new org.amalgam.Service.Player._PlayerServiceStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static org.amalgam.Service.Player.PlayerService unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof org.amalgam.Service.Player.PlayerService)
      return (org.amalgam.Service.Player.PlayerService)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      org.amalgam.Service.Player._PlayerServiceStub stub = new org.amalgam.Service.Player._PlayerServiceStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}
