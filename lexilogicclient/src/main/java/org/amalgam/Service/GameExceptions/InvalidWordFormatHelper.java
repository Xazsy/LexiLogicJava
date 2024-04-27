package org.amalgam.Service.GameExceptions;


/**
* org/amalgam/Service/GameExceptions/InvalidWordFormatHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from GameService.idl
* Saturday, April 27, 2024 5:35:13 PM SGT
*/

abstract public class InvalidWordFormatHelper
{
  private static String  _id = "IDL:org/amalgam/Service/GameExceptions/InvalidWordFormat:1.0";

  public static void insert (org.omg.CORBA.Any a, org.amalgam.Service.GameExceptions.InvalidWordFormat that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static org.amalgam.Service.GameExceptions.InvalidWordFormat extract (org.omg.CORBA.Any a)
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
          org.omg.CORBA.StructMember[] _members0 = new org.omg.CORBA.StructMember [1];
          org.omg.CORBA.TypeCode _tcOf_members0 = null;
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _members0[0] = new org.omg.CORBA.StructMember (
            "reason",
            _tcOf_members0,
            null);
          __typeCode = org.omg.CORBA.ORB.init ().create_exception_tc (org.amalgam.Service.GameExceptions.InvalidWordFormatHelper.id (), "InvalidWordFormat", _members0);
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

  public static org.amalgam.Service.GameExceptions.InvalidWordFormat read (org.omg.CORBA.portable.InputStream istream)
  {
    org.amalgam.Service.GameExceptions.InvalidWordFormat value = new org.amalgam.Service.GameExceptions.InvalidWordFormat ();
    // read and discard the repository ID
    istream.read_string ();
    value.reason = istream.read_string ();
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, org.amalgam.Service.GameExceptions.InvalidWordFormat value)
  {
    // write the repository ID
    ostream.write_string (id ());
    ostream.write_string (value.reason);
  }

}
