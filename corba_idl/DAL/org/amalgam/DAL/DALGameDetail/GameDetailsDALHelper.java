package org.amalgam.DAL.DALGameDetail;


/**
* org/amalgam/DAL/DALGameDetail/GameDetailsDALHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from DataAccessLayer.idl
* Sunday, May 5, 2024 5:01:36 PM SGT
*/

abstract public class GameDetailsDALHelper
{
  private static String  _id = "IDL:org/amalgam/DAL/DALGameDetail/GameDetailsDAL:1.0";

  public static void insert (org.omg.CORBA.Any a, org.amalgam.DAL.DALGameDetail.GameDetailsDAL that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static org.amalgam.DAL.DALGameDetail.GameDetailsDAL extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (org.amalgam.DAL.DALGameDetail.GameDetailsDALHelper.id (), "GameDetailsDAL");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static org.amalgam.DAL.DALGameDetail.GameDetailsDAL read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_GameDetailsDALStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, org.amalgam.DAL.DALGameDetail.GameDetailsDAL value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static org.amalgam.DAL.DALGameDetail.GameDetailsDAL narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof org.amalgam.DAL.DALGameDetail.GameDetailsDAL)
      return (org.amalgam.DAL.DALGameDetail.GameDetailsDAL)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      org.amalgam.DAL.DALGameDetail._GameDetailsDALStub stub = new org.amalgam.DAL.DALGameDetail._GameDetailsDALStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static org.amalgam.DAL.DALGameDetail.GameDetailsDAL unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof org.amalgam.DAL.DALGameDetail.GameDetailsDAL)
      return (org.amalgam.DAL.DALGameDetail.GameDetailsDAL)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      org.amalgam.DAL.DALGameDetail._GameDetailsDALStub stub = new org.amalgam.DAL.DALGameDetail._GameDetailsDALStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}
